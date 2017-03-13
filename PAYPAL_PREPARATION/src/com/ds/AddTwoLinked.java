package com.ds;

public class AddTwoLinked {

	/**
	 * @param args
	 */
	
	 static ListNode addTwoLists(ListNode first, ListNode second) {
	        ListNode res = null; // res is head ListNode of the resultant list
	        ListNode prev = null;
	        ListNode temp = null;
	        int carry = 0, sum;
	 
	        while (first != null || second != null) //while both lists exist
	        {
	            // Calculate value of next digit in resultant list.
	            // The next digit is sum of following things
	            // (i)  Carry
	            // (ii) Next digit of first list (if there is a next digit)
	            // (ii) Next digit of second list (if there is a next digit)
	            sum = carry + (first != null ? first.data : 0)
	                    + (second != null ? second.data : 0);
	 
	            // update carry for next calulation
	            carry = (sum >= 10) ? 1 : 0;
	 
	            // update sum if it is greater than 10
	            sum = sum % 10;
	 
	            // Create a new ListNode with sum as data
	            temp = new ListNode();
	            temp.data=sum;
	 
	            // if this is the first ListNode then set it as head of
	            // the resultant list
	            if (res == null) {
	                res = temp;
	            } else // If this is not the first ListNode then connect it to the rest.
	            {
	                prev.next = temp;
	            }
	 
	            // Set prev for next insertion
	            prev = temp;
	 
	            // Move first and second pointers to next nodes
	            if (first != null) {
	                first = first.next;
	            }
	            if (second != null) {
	                second = second.next;
	            }
	        }
	 
	        if (carry > 0) {
	            temp.next = new ListNode();
	            temp.data=carry;
	        }
	 
	        // return head of the resultant list
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      SingleLinkedList newList = new SingleLinkedList();
      newList.add(1);
       newList.add(2);
      newList.add(90);
        newList.add(4);
      newList.add(5);
      System.out.println(111);
		
      SingleLinkedList newList1 = new SingleLinkedList();
      newList1.add(1);
       newList1.add(2);
      newList1.add(90);
      
      addTwoLists(newList, newList1);

	}

}

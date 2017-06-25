package com.ds;


 class ListNode
{
    int data;
    ListNode next;
}

 class SingleLinkedList
 {
     private ListNode listNode;
  
     public SingleLinkedList()
     {
         listNode = new ListNode();
     }
  
     public ListNode add(int data)
     {
         ListNode tempList = listNode;
  
         if ((tempList.next == null) && (tempList.data == 0))
         {
             tempList.data = data;
  
             return tempList;
         }
         else
         {
             while (tempList.next != null)
             {
                 tempList = tempList.next;
             }
  
             ListNode newNode = new ListNode();
             newNode.data = data;
  
             tempList.next = newNode;
  
             return newNode;
         }
     }
  
     public void printList()
     {
         ListNode tempNode = listNode;
         while(tempNode != null)
         {
             System.out.print(tempNode.data+" -> ");
             tempNode = tempNode.next;
         }
         System.out.println("null");
     }
  
     public ListNode getList()
     {
         return listNode;
     }
  
     public void setList(ListNode setListNode)
     {
         listNode = setListNode;
     }
 }
 
 class DetectLoopInLinkedList
 {
     public DetectLoopInLinkedList()
     {
     }
  
     public boolean hasaLoop(ListNode loopedList)
     {
         boolean loopFound = false;
         ListNode fastNode = loopedList;
         ListNode slowNode = loopedList;
  
         while(fastNode.next.next != null)
         {
             slowNode = slowNode.next;
             fastNode = fastNode.next.next;
  
             if(slowNode == fastNode)
             {
                 loopFound = true;
                 break;
             }
         }
  
         return loopFound;
     }
  
     public static void main(String[] args)
     {
         SingleLinkedList newList = new SingleLinkedList();
         newList.add(1);
         ListNode loopNode1=  newList.add(2);
         ListNode loopNode = newList.add(90);
         ListNode loopNode3=  newList.add(4);
         ListNode loopNode2=  newList.add(5);
         ListNode endNode = newList.add(6);
         //  Creating a loop
        endNode.next = loopNode3;
  
         ListNode loopedList = newList.getList();
         DetectLoopInLinkedList detectLoopedList = new DetectLoopInLinkedList();
  
         if(detectLoopedList.hasaLoop(loopedList))
         {
             System.out.println("Loop is detected");
         }
         else
         {
             System.out.println("No Loop found");
         }
         
         ListNode loopDetectionNode = detectLoopedList.returnLoopDetectionNode(loopedList);
        int loopLength = detectLoopedList.getLoopLength(loopDetectionNode);
         int lengthTillMergingPoint = detectLoopedList.getMergingPointLength(loopedList, loopDetectionNode);         int lengthOfList = loopLength + lengthTillMergingPoint;
        removeLoop1(loopDetectionNode, loopedList);
//      ListNode correctNode= removeLoop1(loopDetectionNode, loopedList);
  //    printList(correctNode);
//      SingleLinkedList newList1 = new SingleLinkedList();
//      newList.add(1);
//       newList.add(2);
//      newList.add(90);
//        newList.add(4);
//      newList.add(5);
    // ListNode ls= newList.add(6);
      swapNodes(1, 90,loopedList );
     }
     
     
     
    public static ListNode removeLoop1(ListNode loopNode, ListNode listNode)
     {
    	ListNode ptr1 = loopNode;
    	ListNode ptr2 = loopNode;
         int looplen = 1;
          
         // count the number of nodes in loop
         while(ptr1.next != ptr2)
         {
             ptr1 = ptr1.next;
             looplen++;
         }
          
         ptr1 = listNode;
         ptr2 = listNode;
         for(int i=0; i < looplen; i++)
         {
             ptr2 = ptr2.next;
         }
          
         while(ptr2.next != ptr1.next)
         {
             ptr1 = ptr1.next;
             ptr2 = ptr2.next;
         }
          
         ptr2.next = null; // breaking the loop
         
       return ptr2;
     }
     
     // Function to print the linked list
     public static void printList(ListNode ListNode) {
         while (ListNode != null) {
             System.out.print(ListNode.data + " ");
             ListNode = ListNode.next;
         }
     }

	public ListNode returnLoopDetectionNode(ListNode loopedList)
     {
         ListNode fastNode = loopedList;
         ListNode slowNode = loopedList;
  
         while(fastNode.next.next != null)
         {
             slowNode = slowNode.next;
             fastNode = fastNode.next.next;
  
             if(slowNode == fastNode)
             {
                 break;
            	 
             }
         }
  
         return slowNode;
     }
  
     public int getLoopLength(ListNode loopDetectionNode)
     {
         //  Take two pointers at loop detection ListNode and calculate loop length
         ListNode P1 = loopDetectionNode;
         ListNode P2 = loopDetectionNode;
  
         int loopLength = 1;
  
         do
         {
             loopLength++;
             P2 = P2.next;
         }while(P1 != P2);
  
         return (loopLength - 1);
     }
  
     public int getMergingPointLength(ListNode loopedList, ListNode loopDetectionNode)
     {
         ListNode P1 = loopedList;
         ListNode P2 = loopDetectionNode;
  
         //  Calculate length till the merging point
         int length = 1;
         while(P1 != P2)
         {
             P1 = P1.next;
             P2 = P2.next;
             length ++;
         }
  
         return (length - 1);
     }
  
     public static void swapNodes(int x, int y,ListNode llist)
     {
         // Nothing to do if x and y are same
         if (x == y) return;
  
         // Search for x (keep track of prevX and CurrX)
         ListNode prevX = null, currX = llist;
         while (currX != null && currX.data != x)
         {
             prevX = currX;
             currX = currX.next;
         }
  
         // Search for y (keep track of prevY and currY)
         ListNode prevY = null, currY = llist;
         while (currY != null && currY.data != y)
         {
             prevY = currY;
             currY = currY.next;
         }
  
         // If either x or y is not present, nothing to do
         if (currX == null || currY == null)
             return;
  
         // If x is not listNode of linked list
         if (prevX != null)
             prevX.next = currY;
         else //make y the new listNode
             llist = currY;
  
         // If y is not listNode of linked list
         if (prevY != null)
             prevY.next = currX;
         else // make x the new listNode
             llist = currX;
  
         // Swap next pointers
         ListNode temp = currX.next;
         currX.next = currY.next;
         currY.next = temp;
     }
 }
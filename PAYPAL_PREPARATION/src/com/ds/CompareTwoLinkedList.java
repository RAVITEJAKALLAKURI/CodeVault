package com.ds;

public class CompareTwoLinkedList {

	/**
	 * @param args
	 */
	
	int compare(ListNode node1, ListNode node2) {
		 
        if (node1 == null && node2 == null) {
            return 1;
        }
        while (node1 != null && node2 != null && node1.data == node2.data) {
            node1 = node1.next;
            node2 = node2.next;
        }
 
        // if the list are diffrent in size
        if (node1 != null && node2 != null) {
            return (node1.data > node2.data ? 1 : -1);
        }
 
        // if either of the list has reached end
        if (node1 != null && node2 == null) {
            return 1;
        }
        if (node1 == null && node2 != null) {
            return -1;
        }
        return 0;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

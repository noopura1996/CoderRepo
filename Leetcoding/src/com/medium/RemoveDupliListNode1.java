package com.medium;


public class RemoveDupliListNode1 {

	public static void main(String[] args) {
		//1,2,3,3,4,4,5
		//0,0,0,1,1,1,2,3,3,4,5,5,6,7,8,9
		ListNode head = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(5);
		head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		ListNode output = removeDup(head);
		while(output != null) {
			System.out.print(output.val+" ");
			output = output.next;
		}
	}

	private static ListNode removeDup(ListNode head) {
		ListNode result = head;
		while(head != null && head.next != null) {
			if(head.val == head.next.val)
				head.next = head.next.next;
			else
				head = head.next;
		}
		return result;		
	}
}

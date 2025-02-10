package com.medium;

/*You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains 
a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, 
except the number 0 itself.*/
public class AddTwoNumberUsingListNode {

	static ListNode addTwoNumberUsingListNode(ListNode l1,ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode result = dummy;
		int dig = 0;
		int carry = 0;
		while(l1 != null ||l2 != null ||carry != 0 ) {
			dig = carry;
			if(l1!=null) {
				dig+=l1.val;
				l1 = l1.next;
			}
			if(l2!=null) {
				dig+=l2.val;
				l2 = l2.next;
			}
			int sum = dig%10;
			carry = dig/10;
			dummy.next = new ListNode(sum);
			dummy = dummy.next;
		}
		return result.next;
		
	}
	public static void main(String[] args) {
		ListNode l11 = new ListNode(2);		
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		l11.next = l12;
		l12.next = l13;
		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l21.next = l22;
		l22.next = l23;
		ListNode output = addTwoNumberUsingListNode(l11, l21);
		while(output!=null) {
			System.out.print(output.val);
			output = output.next;
		}
	}

}

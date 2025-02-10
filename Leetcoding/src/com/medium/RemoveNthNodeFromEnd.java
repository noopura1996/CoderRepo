package com.medium;



public class RemoveNthNodeFromEnd {

	static ListNode removeNthNode(ListNode head, int n) {
		 ListNode res = new ListNode(0, head);
	     ListNode dummy = res;
		for (int i=0;i<n;i++) {
			head = head.next;
		}
		if (head == null) {
			return res.next;
		}
		while (head!=null) {
			head=head.next;
			dummy=dummy.next;
		}
		dummy.next = dummy.next.next;		
		
		return res.next;
		
	}
	
	//alternate
	static ListNode removesNthNode(ListNode head, int n) {
		 ListNode slow = head;
	     ListNode fast = head;
		for (int i=0;i<n;i++) {
			fast = fast.next;
		}
		if (fast == null) {
			return head.next;
		}
		while (fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next = slow.next.next;		
		System.out.println("Return");
		return head;
		
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		int n = 2;
		//ListNode node  = removeNthNode(node1,n);
		ListNode nodealternate  = removesNthNode(node1,n);
	//	ListNode current = nodealternate;  
		while (nodealternate != null) {  
		    System.out.println(nodealternate.val);  
		    nodealternate = nodealternate.next;  
		}  
	}

}

package com.medium;

public class SwapKNodes {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		int k = 3;
		int arr[] = new int[k];
        ListNode temp = l1;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = l1;
        while(size-k>=0){
           ListNode prev = temp;
           //storing node values to array
            for(int i =0;i<k;i++){
                arr[i] = temp.val;
                temp = temp.next;
            }
            //reversing the array and storing to nodes
            for(int i =k-1;i>=0;i--){
                prev.val = arr[i];
                prev = prev.next;
            }
            size-=k;
        }
        ListNode head = l1;
        while(head!=null) {
        	System.out.println(head.val);
        	head = head.next;
        }

	}

}

package com.medium;

public class SwapPairs {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		ListNode dummy = new ListNode(0, l1);
        ListNode previous = dummy, current = l1;//l1 = 1;
        while (current != null && current.next != null) { //cur = 1 //cur=3
            ListNode nextpairnode = current.next.next; //npn = 3
            ListNode second = current.next; //second = 2 //second = 4

            second.next = current; //1 //3
            current.next = nextpairnode; //3 
            previous.next = second; //2 //4

            previous = current; //1  //3
            current = nextpairnode; //3 
        }

	        ListNode output =  dummy.next; 
	        while(output != null) {
	        	System.out.println(output.val);
	        	output = output.next;
	        }
	}

}

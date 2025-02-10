package com.easy;

public class MergeTwoSortedLists {

	static ListNode getMergedList(ListNode list1,ListNode list2) {
		ListNode result = new ListNode();
		ListNode head = result;
		while (list1 != null && list2 != null) {
			if(list1.val<list2.val) {
				head.next = list1;
				list1 = list1.next;
			} else {
				head.next = list2;
				list2 = list2.next;
			}
			head = head.next;
		}
		head.next = (list1!=null)?list1:list2;
		return result.next;
	}
	
	//using recursion if list1 element greater tha list2 element, the elements 
	//are then swapped and next node of list1 is called recursively. If
	//list1 element is small then it is retained and list.next node again passed 
	//recursively
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return (list1 != null) ? list1 : list2;
        }

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        list1.next = mergeTwoLists(list1.next, list2);
        return list1;        
    }
	
	public static void main(String[] args) {
		ListNode list11 = new ListNode(1);
		//ListNode list21 = new ListNode(0);
		ListNode list12 = new ListNode(2);
		ListNode list13 = new ListNode(4);
		ListNode list21 = new ListNode(1);
		ListNode list22 = new ListNode(3);
		ListNode list23 = new ListNode(4);
		list11.next = list12;
		list12.next = list13;
		list21.next = list22;
		list22.next = list23;
		ListNode output = getMergedList( list11, list21);
		//ListNode output = mergeTwoLists( list11, list21);
		ListNode current = output;
		while(current!=null) {
			System.out.println("Array "+ current.val);
			current = current.next;
		}

	}

}

package leetcode;
/*876. Middle of the Linked List
Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.*/



 // Definition for singly-linked list.
 
public class LinkedListMidEle{	
	public ListNode middleNode(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		
		while(fast != null && fast.next!= null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow);
		return slow;
	}
}

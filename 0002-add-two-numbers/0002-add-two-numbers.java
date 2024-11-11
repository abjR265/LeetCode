/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode currNode = headNode;
        int car=0;   
        while (l1 != null || l2 != null || car != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int s = v1 + v2 + car;
            car = s/10;
            currNode.next = new ListNode(s%10);
            currNode = currNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null)  l2 = l2.next;
            
        }
        
        return headNode.next;
        
    } 
}
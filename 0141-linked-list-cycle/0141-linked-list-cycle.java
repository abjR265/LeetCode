/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode h = head, t = head;
         if(head == null){
            return false;
        }
            while (h != null && h.next != null){
                h = h.next.next;
                t = t.next;
             if (t == h){
                    return true;
            }
        }
       
        return false;
    }
}
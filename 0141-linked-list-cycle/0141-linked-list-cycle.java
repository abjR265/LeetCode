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
        ListNode hare = head;
        ListNode turtle = head;
        if(head == null){
            return false;
        }
        while (hare != null && hare.next != null){
             hare = hare.next.next;
            turtle = turtle.next;
           
            if( turtle == hare){
                return true;
            }
          
        }
   return false;
    }  
}
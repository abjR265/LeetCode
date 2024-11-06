/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        // Initialize the current node as the head
        Node current = head;

        // Traverse the list until the end
        while (current != null) {
            // If there is no child, move to the next node
            if (current.child == null) {
                current = current.next;
                continue;
            }

            // There is a child, so find the tail of the child list
            Node temp = current.child;
            while (temp.next != null) {
                temp = temp.next;
            }

            // Connect the tail of the child list to the current's next node
            temp.next = current.next;
            if (current.next != null) {
                current.next.prev = temp;
            }

            // Connect the current node to the child and update pointers
            current.next = current.child;
            current.child.prev = current;
            current.child = null; // Remove the child link

            // Move to the next node
            current = current.next;
        }

        return head;
    }
}

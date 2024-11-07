/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    // Method to create a deep copy of a linked list with random pointers
    public Node copyRandomList(Node head) {
        // Map to hold the mapping from original nodes to their corresponding copied nodes
        Map<Node, Node> map = new HashMap<>();

        // Step 1: First pass to create a copy of each node and store it in the map
        Node cur = head;
        while (cur != null) {
            // For each node in the original list, create a new node with the same value
            map.put(cur, new Node(cur.val));
            // Move to the next node in the original list
            cur = cur.next;
        }

        // Step 2: Second pass to set up next and random pointers for each copied node
        cur = head;
        while (cur != null) {
            // Set the next pointer of the copied node
            map.get(cur).next = map.get(cur.next);
            // Set the random pointer of the copied node
            map.get(cur).random = map.get(cur.random);
            // Move to the next node in the original list
            cur = cur.next;
        }

        // Return the head of the copied list, which is the copy of the original head
        return map.get(head);
    }
}

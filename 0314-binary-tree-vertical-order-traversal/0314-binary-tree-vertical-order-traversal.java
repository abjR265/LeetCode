/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        // TreeMap to store the nodes at each column index in sorted order
        Map<Integer, List<Integer>> columnTable = new TreeMap<>();
        // Queue for BFS, each entry holds a node and its column index
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();

        // Initialize BFS with the root node at column 0
        queue.offer(new Pair<>(root, 0));

        // Process nodes in the queue
        while (!queue.isEmpty()) {
            // Retrieve the next node and its column index
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int column = pair.getValue();

            // Only process non-null nodes
            if (node != null) {
                // Check if the column is already in the map
                // If not, create a new list for that column
                if (!columnTable.containsKey(column)) {
                    columnTable.put(column, new ArrayList<>());
                }
                // Add the current node's value to the list at its column index
                columnTable.get(column).add(node.val);

                // Add the left child to the queue with column index - 1
                queue.offer(new Pair<>(node.left, column - 1));
                // Add the right child to the queue with column index + 1
                queue.offer(new Pair<>(node.right, column + 1));
            }
        }

        // Prepare the final output list
        List<List<Integer>> output = new ArrayList<>();
        // Collect all column entries from the TreeMap in sorted order
        for (List<Integer> list : columnTable.values()) {
            output.add(list);
        }

        // Return the vertical order traversal as a list of lists
        return output;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Instantiate the Solution class and perform vertical order traversal
        Solution solution = new Solution();
        List<List<Integer>> result = solution.verticalOrder(root);

        // Print the result
        System.out.println("Vertical Order Traversal:");
        for (List<Integer> column : result) {
            System.out.println(column);
        }
    }
}

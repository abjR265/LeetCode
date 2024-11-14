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
        // Using TreeMap to keep the columns sorted
        Map<Integer, List<Integer>> columnTable = new TreeMap<>();
        // Queue to hold pairs of nodes and their column indexes
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();

        // Start BFS with the root node at column 0
        queue.offer(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int column = pair.getValue();

            if (node != null) {
                // Add the node value to the list at its column index
                columnTable.computeIfAbsent(column, k -> new ArrayList<>()).add(node.val);

                // Add the left child with column - 1
                queue.offer(new Pair<>(node.left, column - 1));
                // Add the right child with column + 1
                queue.offer(new Pair<>(node.right, column + 1));
            }
        }

        // Gather the results from the sorted columns
        List<List<Integer>> output = new ArrayList<>();
        for (List<Integer> list : columnTable.values()) {
            output.add(list);
        }

        return output;
    }
}

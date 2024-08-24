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
    public List<Integer> inorderTraversal(TreeNode root){
         List<Integer> res = new ArrayList<>();
         Stack<TreeNode> s1 = new Stack<>();
    
     TreeNode curr_node = root;
    
    while (true){
        if (curr_node != null){
            s1.push(curr_node);
            curr_node = curr_node.left;
        }
        else {
            if(s1.isEmpty()){
                 break;
            }
            curr_node = s1.pop();
            res.add(curr_node.val);
            curr_node = curr_node.right;
          }  
        }
        return res;
    }
}
    
    
   
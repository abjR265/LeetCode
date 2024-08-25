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
    boolean ans=false;
    public boolean isEquals(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.val!=t.val) return false;
        return isEquals(s.left, t.left) && isEquals(s.right, t.right);
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t==null) return true;
        if(s==null) return false;
        isSubtree(s.left, t);
        isSubtree(s.right, t);
        ans=ans || isEquals(s, t);
        return ans;

    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        
        helper(root,ans,0);
        return ans;
    }
    
    private void helper(TreeNode root,List<List<Integer>> ans, int level){
        
        if(root == null)
            return;
        
        try{
            ans.get(level);
        } catch(IndexOutOfBoundsException iobe){
            ans.add(new ArrayList<>());
        }
        
        ans.get(level).add(root.val);
        
        helper(root.left,ans,level+1);
        helper(root.right,ans,level+1);
        
    }
}
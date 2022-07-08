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
    public int minDiffInBST(TreeNode root) {
        
        List<Integer> values = new ArrayList<>();
        
        inorder(root,values);
        
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0;i<values.size()-1;i++)
            minDiff = Math.min(values.get(i+1) - values.get(i),minDiff);
         
        return minDiff;
        
    }
    
    private void inorder(TreeNode root, List<Integer> values){
        
        if(root == null)
            return;
        
        inorder(root.left,values);
        
        values.add(root.val);
        
        inorder(root.right,values);
        
        
        
    }
}
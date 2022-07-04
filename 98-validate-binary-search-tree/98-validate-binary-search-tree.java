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
    public boolean isValidBST(TreeNode root) {
        
        try{
            getMinMax(root);
        } catch(ArithmeticException ae){
            return false;
        }
        
        return true;
        
    }
    
    private int[] getMinMax(TreeNode root) throws ArithmeticException{
        
        if(root.left == null && root.right == null)
            return new int[]{root.val,root.val};
        
        int[] left = new int[]{root.val,root.val};
        int[] right = new int[] {root.val,root.val};
        
        if(root.left != null){
            
            left = getMinMax(root.left);
            if(left[1] >= root.val)
                throw new ArithmeticException();
        }
        
        if(root.right != null){
            
            right = getMinMax(root.right);
            
            if(right[0] <= root.val)
                throw new ArithmeticException();
        }
        
        return new int[]{Math.min(root.val,left[0]),Math.max(root.val,right[1])};
        
    }
}
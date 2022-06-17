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
    public int minCameraCover(TreeNode root) {

        // System.out.println("Starting");
        
        int[] ans = helper(root);

        return Math.min(ans[1],ans[2]);
    }

    private int[] helper(TreeNode root) {

        if (root == null)
            return new int[]{0,0,999999};
        
        int[] l = helper(root.left);
        int[] r = helper(root.right);
        
        int mL12 = Math.min(l[1],l[2]);
        int mR12 = Math.min(r[1],r[2]);
        
        int d0  =l[1] + r[1];
        int d1 = Math.min(l[2] + mR12,r[2] + mL12);
        int d2 = 1 + Math.min(l[0] ,mL12) + Math.min(r[0],mR12);
        
        return new int[] {d0,d1,d2};

       

    }
}
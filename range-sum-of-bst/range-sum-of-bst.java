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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        Stack<TreeNode> q = new Stack<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.pop();

            int tVal = temp.val;

            if (tVal >= low && tVal <= high) {
                sum += tVal;

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);

            } else if (tVal < low && temp.right != null) 
                    q.add(temp.right);
             else if (temp.left != null)
                q.add(temp.left);

        }

        return sum;
    }
}
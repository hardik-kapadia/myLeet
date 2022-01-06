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
    Map<Integer, Integer> map;

    public Solution() {
        this.map = new HashMap<>();
    }

    public int rob(TreeNode root) {
        return Math.max(helper(root, true), helper(root, false));
    }

    int helper(TreeNode root, boolean parentRobbed) {

        if (root == null)
            return 0;

        int hash = getHash(root, parentRobbed);

        if (map.containsKey(hash))
            return map.get(hash);

        int skipping = helper(root.left, false) + helper(root.right, false);
        int robbing = root.val + helper(root.left, true) + helper(root.right, true);

        int temp = parentRobbed ? skipping : Math.max(skipping, robbing);

        map.put(hash, temp);

        return temp;

    }

    private static int getHash(TreeNode root, boolean parentRobbed) {
        return (root.hashCode() + 7) * 28 * (parentRobbed ? 36 : 5);
    }
}
class SegmentTreeNode {

    int val;
    int start, end;
    SegmentTreeNode left, right;

    public SegmentTreeNode(int val, int start, int end) {
        this.val = val;
        this.start = start;
        this.end = end;
        this.left = null;
        this.right = null;
    }

    public SegmentTreeNode(int val, int start, int end, SegmentTreeNode left, SegmentTreeNode right) {
        this.val = val;
        this.start = start;
        this.end = end;
        this.left = left;
        this.right = right;
    }

    public static SegmentTreeNode getTreeFromArray(int[] nums) {
        return getTreeFromArray(nums, 0, nums.length - 1);
    }

    public static SegmentTreeNode getTreeFromArray(int[] nums, int start, int end) {

        if (start > end)
            return null;

        if (end == start)
            return new SegmentTreeNode(nums[start], start, end);

        SegmentTreeNode left = getTreeFromArray(nums, start, (start + end) / 2);
        SegmentTreeNode right = getTreeFromArray(nums, ((start + end) / 2) + 1, end);

        return new SegmentTreeNode(left.val + right.val, start, end, left, right);
    }
}


public class NumArray {

    int[] nums;
    SegmentTreeNode root;

    public NumArray(int[] nums) {

        this.nums = nums;
        this.root = SegmentTreeNode.getTreeFromArray(nums);
    }

    public void update(int index, int val) {
        updateTree(index, val, root);
    }

    private void updateTree(int index, int val, SegmentTreeNode root) {

        if (root.start == index && root.end == root.start) {
            root.val = val;
            return;
        }

        int mid = (root.start + root.end) / 2;

        if (index <= mid)
            updateTree(index, val, root.left);
        else
            updateTree(index, val, root.right);

        root.val = root.left.val + root.right.val;

    }

    public int sumRange(int left, int right) {

        return getSumOfRange(left, right, root);
    }

    private int getSumOfRange(int left, int right, SegmentTreeNode node) {

        if (node.start == left && node.end == right)
            return node.val;

        int mid = (node.start + node.end) / 2;

        if (left > mid)
            return getSumOfRange(left, right, node.right);
        else if (right <= mid)
            return getSumOfRange(left, right, node.left);

        int leftSum = getSumOfRange(left, mid, node.left);
        int rightSum = getSumOfRange(mid + 1, right, node.right);

        return leftSum + rightSum;

    }

}

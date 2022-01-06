class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;

        int l1 = nums1.length;
        int l2 = nums2.length;

        int l = l1 + l2;

        int[] merged = new int[l];

        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < l1) {
            merged[k++] = nums1[i++];
        }

        while (j < l2) {
            merged[k++] = nums2[j++];
        }

        // System.out.printf("%-50s:",Arrays.toString(merged));

        double median;

        if (l % 2 == 0) {
            median = (merged[(l / 2) - 1] + merged[(l / 2)]) / 2.0;
        } else {
            if (l == 1)
                median = merged[0];
            else
                median = merged[((l + 1) / 2) - 1];
        }

        return median;
    }
}
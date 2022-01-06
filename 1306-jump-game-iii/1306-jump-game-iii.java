class Solution {
    public boolean canReach(int[] arr, int start) {

        return helper(arr, start, new HashSet<>());

    }

    boolean helper(int[] arr, int i, Set<Integer> visited) {

        // System.out.println("Checking: " + i);

        if (i < 0 || i >= arr.length)
            return false;

        if (visited.contains(i))
            return false;

        if (arr[i] == 0)
            return true;

        visited.add(i);

        return helper(arr, i + arr[i], visited) || helper(arr, i - arr[i], visited);

    }
}
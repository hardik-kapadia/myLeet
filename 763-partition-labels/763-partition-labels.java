class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> ans = new ArrayList<>();

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars)
            map.put(c, map.getOrDefault(c, 0) + 1);

        Set<Character> charsInCurrentSet = new HashSet<>();
        charsInCurrentSet.add(chars[0]);

        int prev = 0;

        for (int i = 0; i < chars.length; i++) {

            if (charsInCurrentSet.isEmpty()) {

                ans.add(i - prev);
                prev = i;
            }

            int left = map.get(chars[i]) - 1;

            if (left == 0) {
                map.remove(chars[i]);
                charsInCurrentSet.remove(chars[i]);
            } else {
                map.put(chars[i], left);
                charsInCurrentSet.add(chars[i]);
            }

        }

        ans.add(chars.length - prev);

        return ans;
    }
}
class Solution {
    public int minDeletions(String s) {
        
        
        int deletions = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Set<Integer> freqs = new HashSet<>();

        Set<Character> keys = map.keySet();

        for (char c : keys) {

            int count = map.get(c);

            while (freqs.contains(count)) {
                count--;
                deletions++;
            }

            if (count != 0)
                freqs.add(count);

        }

        return deletions;
        
    }
}
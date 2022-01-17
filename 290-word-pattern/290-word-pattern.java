class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray();
        String[] words = s.split(" ");

        // System.out.println("Chars: " + Arrays.toString(chars));
        // System.out.println("Words: " + Arrays.toString(words));

        if (words.length != chars.length)
            return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {

            // System.out.println("At " + i + ", the map is: " + map);

            char c = chars[i];
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word))
                    return false;
            } else if (map.containsValue(word))
                return false;
            else
                map.put(c, word);

        }

        return true;
    }
}
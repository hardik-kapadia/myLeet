class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        if (s.length() == 1 || s.length() == 0)
            return s.length();
        
        List<Character> word = new ArrayList<>();

        String ans = "";

        int i = 0;
        int starter = 0;

        while (i < s.length()) {

            // System.out.println(i + " Word: " + word + " - " + s.charAt(i) + "{Starter: " + starter + "}");

            if (word.contains(s.charAt(i))) {

                i = s.indexOf(s.charAt(i), starter) + 1;
                starter = i;
                String temp = word.stream().map(String::valueOf).collect(Collectors.joining());
                // System.out.println("Temp: " + temp);

                if (temp.length() > ans.length())
                    ans = temp;

                word.clear();
            } else {
                word.add(s.charAt(i));
                i++;
            }

        }
        
        String temp = word.stream().map(String::valueOf).collect(Collectors.joining());

        if (temp.length() > ans.length())
            ans = temp;

        // System.out.println("Ans: " + ans);

        return ans.length();
    }
}
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] ch = s.toCharArray();

        int prevN = Integer.MAX_VALUE;
        int num = 0;

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            int val = map.get(c);

            if (val <= prevN)
                num += val;
            else
                num += val - (prevN * 2);

            prevN = val;
        }

        return num;
    }
}
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        char[] symbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = 0;

        int th = num / 1000;

        while (num > 0 && i < 6) {

            int n = num % 10;

            char c1 = symbols[i], c2 = symbols[i + 1], c3 = symbols[i + 2];

            if (n == 9) {
                sb.append(c3);
                sb.append(c1);
            } else {

                if (n >= 5) {
                    for (int j = 0; j < n % 5; j++) {
                        sb.append(c1);
                    }
                    sb.append(c2);
                } else if (n == 4) {
                    sb.append(c2);
                    sb.append(c1);
                } else
                    for (int j = 0; j < n; j++) {
                        sb.append(c1);
                    }

            }

            i += 2;
            num /= 10;
        }

        for (int j = 0; j < th; j++)
            sb.append('M');

        sb.reverse();

        return sb.toString();
    }
}
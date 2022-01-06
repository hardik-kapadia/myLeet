class Solution {
    public int myAtoi(String s) {
        boolean negative = false;
        s = s.trim();
        
        if(s.length()==0){
            return 0;
        }

        int x = 0;

        if (s.charAt(0) == '-') {
            negative = true;
            s = s.substring(1);
        } else if (s.charAt(0) == '+')
            s = s.substring(1);

        for (char c : s.toCharArray()) {

            // System.out.println("Character read: " + c);
            if (c < 48 || c > 57)
                break;

            int digit = c - 48;
            // System.out.println("digit is " + digit);
            long temp = (long) (x) * 10 + digit;

            if (temp > Integer.MAX_VALUE)
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            x = x * 10 + digit;
            // System.out.println("x is now: " + x);
        }

        // System.out.println("Returning: " + x);

        return negative ? x * -1 : x;
    }
}
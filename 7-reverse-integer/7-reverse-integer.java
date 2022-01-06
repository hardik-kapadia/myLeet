class Solution {
    public int reverse(int x) {
        boolean neg = false;

        if (x < 0) {
            x = Math.abs(x);
            neg = true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        sb.reverse();

        int y;

        try {
            y = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }

        return neg ? (y * (-1)) : y;
    }
}
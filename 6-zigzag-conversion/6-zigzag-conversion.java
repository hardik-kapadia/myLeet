class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder zig = new StringBuilder();

        StringBuilder[] lines = new StringBuilder[numRows];

        for (int i = 0; i < lines.length; i++)
            lines[i] = new StringBuilder();

        int cr = 0;
        int i = 0;

        int inc = 1;

        while (i < s.length()) {

            lines[cr].append(s.charAt(i++));

            if (cr == numRows - 1) {
                inc = -1;
            } else if (cr == 0) {
                inc = 1;
            }

            cr += inc;
        }

        for (

        StringBuilder ser : lines) {
            zig.append(ser);
        }

        return zig.toString();
    }
}
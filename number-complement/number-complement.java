class Solution {
    public int findComplement(int num) {

        String bin = getBinary(num);

        bin = bin.replace('1', '2');
        bin = bin.replace('0', '1');
        bin = bin.replace('2', '0');

        return getDecimal(bin);
    }

    public static String getBinary(int num) {

        StringBuilder bin = new StringBuilder();

        while (num > 0) {

            bin.append(num % 2);
            num /= 2;

        }

        return bin.reverse().toString();

    }

    public static int getDecimal(String bin) {
        return Integer.parseInt(bin, 2);
    }
}
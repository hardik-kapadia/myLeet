class Solution {
    public int scoreOfParentheses(String s) {
        
        
        int score = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.add(score);
                score = 0;
            } else
                score = stack.pop() + Math.max(2 * score, 1);
        }

        return score;
        
    }
}
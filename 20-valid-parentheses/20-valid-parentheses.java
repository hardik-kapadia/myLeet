class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        stack.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 40 || c == 91 || c == 123)
                stack.add(c);
            else {

                if(stack.isEmpty())
                    return false;
                
                if (c == 41) {

                    if (stack.peek() == 40)
                        stack.pop();
                    else
                        return false;

                } else {
                    if (stack.peek() == c - 2)
                        stack.pop();
                    else
                        return false;
                }

            }

        }

        return stack.isEmpty();
        
    }
}
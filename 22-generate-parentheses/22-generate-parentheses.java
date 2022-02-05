class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> answer = new ArrayList<>();
    findAll("(", 1, 0, answer, n);
    return answer;
}

private void findAll(String current, int open, int closed, List<String> answer, int n)
{
    if (current.length() == 2 * n)
    {
        answer.add(current);
        return;
    }
    if (open < n)
        findAll(current + "(", open + 1, closed, answer, n);

    if (closed < open)
        findAll(current + ")", open, closed + 1, answer, n);
}
}
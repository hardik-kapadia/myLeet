class Solution {
    public List<String> findWords(char[][] board, String[] words) {

        List<String> found = new ArrayList<>();

        for (String word : words) {


            if (lookForSingleWord(board, word))
                found.add(word);

        }

        return found;

    }

    private boolean lookForSingleWord(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        char[] letters = word.toCharArray();

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == letters[0])
                    if (wordThere(board, letters, i, j, 0, visited))
                        return true;

        return false;

    }

    private boolean wordThere(char[][] board, char[] letters, int r, int c, int letter, boolean[][] visited) {

        if (board[r][c] != letters[letter])
            return false;

        if (letter == letters.length - 1)
            return true;

        visited[r][c] = true;

        if (r > 0)
            if (!visited[r - 1][c])
                if (wordThere(board, letters, r - 1, c, letter + 1, visited))
                    return true;

        if (c > 0)
            if (!visited[r][c - 1])
                if (wordThere(board, letters, r, c - 1, letter + 1, visited))
                    return true;

        if (r < board.length - 1)
            if (!visited[r + 1][c])
                if (wordThere(board, letters, r + 1, c, letter + 1, visited))
                    return true;

        if (c < board[r].length - 1)
            if (!visited[r][c + 1])
                if (wordThere(board, letters, r, c + 1, letter + 1, visited))
                    return true;

        visited[r][c] = false;

        return false;
    }
}
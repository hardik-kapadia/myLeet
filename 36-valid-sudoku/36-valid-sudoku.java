class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        List<Set<Integer>> rows = new ArrayList<>(9);
        List<Set<Integer>> cols = new ArrayList<>(9);
        List<Set<Integer>> boxes = new ArrayList<>(9);

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {

            Set<Integer> currentRow = rows.get(i);

            for (int j = 0; j < 9; j++) {

                int box = ((i / 3) * 3) + (j / 3);

                char c = board[i][j];

                if (c == '.')
                    continue;

                int n = c - 48;

                if (currentRow.contains(n) || cols.get(j).contains(n) || boxes.get(box).contains(n))
                    return false;

                currentRow.add(n);
                cols.get(j).add(n);
                boxes.get(box).add(n);

            }
        }

        return true;
    }
}
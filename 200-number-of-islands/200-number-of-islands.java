class Solution {
    public int numIslands(char[][] grid) {
        
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        
        int islands = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!visited[i][j]){
                    if(grid[i][j] == '1'){
                        
                        islands++;
                        
                        islandFinder(grid,visited,i,j);
                    }
                }
            }
        }
        
        return islands;
        
    }
    
    private void islandFinder(char[][] grid, boolean[][] visited, int sr, int sc){
        
        
            if(sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[0].length)
                return;
        
            if(visited[sr][sc])
                return;
        
            visited[sr][sc] = true;
        
        if(grid[sr][sc] == '0')
            return;
        
        islandFinder(grid,visited,sr+1,sc);
        islandFinder(grid,visited,sr,sc+1);
        islandFinder(grid,visited,sr,sc-1);
        islandFinder(grid,visited,sr-1,sc);
    }
}
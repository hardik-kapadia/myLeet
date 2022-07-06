class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int curColor = image[sr][sc];
        
        Stack<int[]> nodes = new Stack<>();
        Set<String> visited = new HashSet<>();
        
        nodes.add(new int[] {sr,sc});
        
        while(!nodes.empty()){
            
            int[] node = nodes.pop();
            
            if(node[0] < 0 || node[0] >= image.length || node[1] < 0 || node[1] >= image[0].length || visited.contains(node[0]+"_"+node[1]))
                continue;
            
            if(image[node[0]][node[1]] != curColor)
                continue;
            
            image[node[0]][node[1]] = color;
            visited.add(node[0]+"_"+node[1]);
            
            nodes.push(new int[]{node[0] + 1,node[1]});
            nodes.push(new int[]{node[0] ,node[1]+1});
            nodes.push(new int[]{node[0] ,node[1]-1});
            nodes.push(new int[]{node[0] - 1,node[1]});
            
        }
        
        return image;
        
        
        
    }
}
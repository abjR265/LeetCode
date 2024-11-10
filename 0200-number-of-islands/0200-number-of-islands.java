class Solution {
    private int m;
    private int n;
    public int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    
    
    public void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r,c});
        
        while (!q.isEmpty()){
            int[] curr = q.poll();
            
            for (int[] dir: dirs){
                int nr = curr[0] + dir[0];
                int nc = curr[1] + dir[1];
                
                if (nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]=='1'){
                    grid[nr][nc] ='0';
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
        
     public int numIslands(char[][]grid){
             m = grid.length;
             n = grid[0].length;
             int c =0;
             
             for (int i=0; i<m; i++){
                 for (int j=0; j<n; j++){
                     if (grid[i][j]=='1'){
                         c++;
                         bfs(grid, i, j);
                     }
                 }
             }
             return c;
    }
}
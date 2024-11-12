class Solution {
    //public boolean visited[][];
    public boolean exist(char[][] board, String word) {
       // visited = new boolean[board.length][board[0].length];
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length;j++){
                if (word.charAt(0)==board[i][j] && search(board, word, i, j, 0)){
                    return true;
                }
            }

        }         return false;

    }
    public boolean search (char[][]board, String word, int i, int j, int idx){
        if (idx==word.length()){
            return true;
        }
        
        if (i>=board.length || i<0 || j>=board[0].length || j<0 || 
            board[i][j] != word.charAt(idx)){
            return false;
        }
         char temp = board[i][j];
        board[i][j] = '*';
        
        if (
        search(board, word, i, j+1, idx+1) ||
        search(board, word, i, j-1, idx+1) ||
        search(board, word, i+1, j, idx+1) ||
        search(board, word, i-1, j, idx+1)
        ){return true;}
         
          board[i][j] = temp;
        return false;
        
    }
}
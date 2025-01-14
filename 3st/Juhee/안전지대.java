import java.util.*;
class Solution {
    public int solution(int[][] board) {
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int[] dx = {0,1,-1,0,-1,1,1,-1};
        int[] dy = {1,0,0,-1,-1,1,-1,1};
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    int[] temp = {i,j};
                    list.add(temp);
                } 
            }
        }
        
        for(int a = 0 ; a < list.size(); a++){
            int i = list.get(a)[0];
            int j = list.get(a)[1];
            for(int k = 0 ; k < 8; k++){
                        if(dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.length-1 && dy[k] + j <= board.length-1)
                            board[dx[k] + i][dy[k] + j] = 1;
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 0) answer+=1;
            }
        }
        return answer;
    }
}

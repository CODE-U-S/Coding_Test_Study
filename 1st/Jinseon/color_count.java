class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0, n = board.length;
        String color = board[h][w];
        int[][] save_xy = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        for(int i = 0; i < 4; i++){
            int x = h + save_xy[i][0];
            int y = w + save_xy[i][1];
            if(x >= 0 && x < n && y >= 0 && y < n){
                if(color.equals(board[x][y])) answer++;
            }
        }
        return answer;
    }
}
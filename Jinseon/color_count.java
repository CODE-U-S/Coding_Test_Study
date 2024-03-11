class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0, n = board.length;
        
        if(n > h && board[h][w].equals(board[h+1][w])) answer++;
        if(n > w && board[h][w].equals(board[h][w+1])) answer++;
        if(h > 0 && board[h][w].equals(board[h-1][w])) answer++;
        if(w > 0 && board[h][w].equals(board[h][w-1])) answer++;
        return answer;
    }
}

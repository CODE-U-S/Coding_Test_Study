class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int x[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        int y[] = {0, 1, 1, 1, 0, -1, -1, -1};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < x.length; k++) {
                        if (i + y[k] < 0 || j + x[k] < 0 || i + y[k] >= board.length || j + x[k] >= board[i].length) {
                            continue;
                        } else {
                            if (board[i + y[k]][j + x[k]] == 0) {
                                board[i + y[k]][j + x[k]] = 2;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}
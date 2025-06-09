class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int up = 0, left = 0;
        int down = n - 1, right = n - 1;
        int cnt = 1;
        while (cnt <= n * n) {
            for (int i = left; i <= right; i++) {
                answer[up][i] = cnt++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                answer[i][right] = cnt++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                answer[down][i] = cnt++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                answer[i][left] = cnt++;
            }
            left++;
        }
        return answer;
    }
}
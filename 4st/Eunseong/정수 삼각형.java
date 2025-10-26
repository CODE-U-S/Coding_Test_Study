class Solution {
    public int solution(int[][] triangle) {
        int answer[][] = triangle.clone();
        for (int i = 1; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (j == 0) {
                    answer[i][j] += answer[i - 1][j];
                } else if (j == answer[i].length - 1) {
                    answer[i][j] += answer[i - 1][j - 1];
                } else {
                    answer[i][j] += Math.max(answer[i - 1][j - 1], answer[i - 1][j]);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < answer[answer.length - 1].length; i++) {
            if (ans < answer[answer.length - 1][i]) {
                ans = answer[answer.length - 1][i];
            }
        }
        return ans;
    }
}
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

public class MatrixAddition {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] a = { { 1, 2 }, { 2, 3 } };
        int[][] b = { { 3, 4 }, { 5, 6 } };
        int[][] answer = s.solution(a, b);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
        }
    }
}

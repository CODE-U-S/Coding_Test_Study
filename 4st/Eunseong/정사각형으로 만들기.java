class Solution {
    public int[][] solution(int[][] arr) {
        int maxLen = Math.max(arr.length, arr[0].length);
        int answer[][] = new int[maxLen][maxLen];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a1 = arr1.length;
        int a2 = arr1[0].length;
        
        int[][] answer = new int[a1][a2];
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
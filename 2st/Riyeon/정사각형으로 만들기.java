class Solution {
    public int[][] solution(int[][] arr) {
        int n = arr.length>arr[0].length? arr.length: arr[0].length;
        int[][] answer = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                answer[i][j] = arr[i][j];
        }
        return answer;
    }
}
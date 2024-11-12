class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1; i<land.length; i++){
            int n = i-1;
            land[i][0] += Math.max(land[n][1], Math.max(land[n][2], land[n][3]));
            land[i][1] += Math.max(land[n][0], Math.max(land[n][2], land[n][3]));
            land[i][2] += Math.max(land[n][0], Math.max(land[n][1], land[n][3]));
            land[i][3] += Math.max(land[n][0], Math.max(land[n][1], land[n][2]));
        }
        for(int i=0; i<4; i++){
            answer = Math.max(answer, land[land.length-1][i]);
        }
        return answer;
    }
}
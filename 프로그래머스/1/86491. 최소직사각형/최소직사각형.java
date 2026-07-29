class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int temp = 0;
        int[][] re = new int[sizes.length][2];
        
        for (int i = 0; i < sizes.length; i++) { // 가로
            for (int j = 0; j < 2; j++) { // 세로
                if(sizes[i][0] < sizes[i][1]) {
                    re[i][0] = sizes[i][1];
                    re[i][1] = sizes[i][0];
                }
                else {
                    re[i][0] = sizes[i][0];
                    re[i][1] = sizes[i][1];
                }
            }
        }
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        // 가로 최댓값 구함
        for (int i = 0; i < re.length; i++) { 
            if (re[i][0] > maxWidth) {
                maxWidth = re[i][0];
            }
        }
        
        // 세로 최댓값 구함
        for (int i = 0; i < re.length; i++) { 
            if (re[i][1] > maxHeight) {
                maxHeight = re[i][1];
            }
        }
        
        answer = maxHeight * maxWidth;
        
        return answer;
    }
}
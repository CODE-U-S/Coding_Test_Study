class Solution {
    public String solution(int[] numLog) {
        
        String answer = "";
        
        for (int i = 0; i < numLog.length - 1; i++) {
            int j = numLog[i + 1] - numLog[i];
            
            if (j == 1) {
                answer += "w";
            } else if (j == -1) {
                answer += "s";
            } else if (j == 10) {
                answer += "d";
            } else if (j == -10) {
                answer += "a";
            }
        }
        
        return answer;
    }
}

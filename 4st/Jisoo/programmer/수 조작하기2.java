class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            
            if (diff == 1) {
                answer.append("w");
            } else if (diff == -1) {
                answer.append("s");
            } else if (diff == 10) {
                answer.append("d");
            } else if (diff == -10) {
                answer.append("a");
            }
        }
        
        return answer.toString();
    }
}
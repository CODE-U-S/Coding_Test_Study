class Solution {
    public String solution(int n) {
        String answer = "";
        
        for (int i=0; i<(n/2); i++) {
            answer += "수박";
        }
        
        if (n%2!=0) {
            answer += "수";
        }
        
        return answer;
    }
}

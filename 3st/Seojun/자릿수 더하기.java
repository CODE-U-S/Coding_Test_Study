class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String numStr = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
           
            answer += numStr.charAt(i) - '0';
        }
        return answer;
    }
}



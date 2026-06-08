class Solution {
    public String solution(String s) {
        String answer = "";
        
        //홀수
        if (s.length() % 2 == 1) {
            int center = s.length() / 2;
            answer += s.charAt(center);
        }
        
        //짝수
        else if (s.length() % 2 == 0) {
            int center = s.length() / 2;
            answer += s.charAt(center - 1);
            answer += s.charAt(center);
        }
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        if(s.length() % 2==1) { //홀수라면
            return answer = String.valueOf(s.charAt(size/2));
        }
        if(s.length() % 2==0) { //짝수라면
            answer += String.valueOf(s.charAt((size/2)-1));
            answer += String.valueOf(s.charAt((size/2)));
            return answer;
        }
        return answer;
    }
}
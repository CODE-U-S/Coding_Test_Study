class Solution {
    public String solution(String rsp) {
        String answer = "";
        char rock = '0';
        char scissors = '2';
        char paper = '5';
        for(int i=0; i<rsp.length(); i++) {
            if(rsp.charAt(i) == rock) {
                answer += paper;
            }
            else if(rsp.charAt(i) == scissors) {
                answer += rock;
            }
            else if(rsp.charAt(i) == paper) {
                answer += scissors;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        if(str.length % 2 == 0) {
            answer += str[str.length/2-1];
            answer += str[str.length/2];
        }
        else {
            answer += str[str.length/2];
        }
        return answer;
    }
}

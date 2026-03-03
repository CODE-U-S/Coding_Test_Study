class Solution {
    public String solution(int age) {
        
        String answer = "";
        String strAge = String.valueOf(age);
        
        for(int i = 0; i < strAge.length(); i++) {
            char c = (char) (strAge.charAt(i) - '0' + 'a');
            answer += c;
        }

        return answer;
    }
}
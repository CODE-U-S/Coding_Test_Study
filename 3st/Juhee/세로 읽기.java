class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = 0 ; i < my_string.length() ; i++){
            if( (i+1) % m == c || m == 1 || ((i+1) % m == 0 && c == m) ){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
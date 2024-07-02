import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        boolean even = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                even = true;
                answer += " ";
            } else {
                if(even){
                    answer += s.substring(i, i+1).toUpperCase();
                    even = false;
                } else {
                    answer += s.substring(i, i+1).toLowerCase();
                    even = true;
                }
            }
        }
        return answer;
    }
}
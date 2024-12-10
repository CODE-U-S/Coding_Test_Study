import java.util.*;
class Solution {
    public String solution(String s) {
       StringBuilder sb = new StringBuilder();
        int size = s.length();
        boolean first = true;
        for(int i = 0; i < size; i++){
            char cur = s.charAt(i);
            // 이번 문자가 공백이라면?
            if(cur == ' '){
                sb.append(' ');
                first = true;
                continue;
            }
            // JadenCase 첫 문자 X
            if(!first){
                sb.append(Character.toString(cur).toLowerCase());
                continue;
            }
            // JandenCase 첫 문자 O
            sb.append(Character.toString(cur).toUpperCase());
            first = false;
        }
        return sb.toString();
    }
}

//level 2
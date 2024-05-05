import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char skip_letters[] = skip.toCharArray();
        char s_letters[] = s.toCharArray();
        
        for(char letter : s_letters){
            for(int i = 0; i < index; i++){
                if(++letter == 'z' + 1) letter = 'a';
                if(-1 != skip.indexOf(letter)) i--;
            }// inner for
            answer += letter;
        }// outter for
        
        return answer;
    }
}

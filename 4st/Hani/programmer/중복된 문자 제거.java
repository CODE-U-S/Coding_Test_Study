import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int[] up = new int[26];
        int[] lo = new int[26];
        boolean space = false;
        
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                up[c - 'A']++;
                if (up[c - 'A'] == 1) {
                    temp.append(c);
                }
                
            }
            else if (Character.isLowerCase(c)) {
                lo[c - 'a']++;
                if (lo[c - 'a'] == 1) {
                    temp.append(c);
                }
            }
            else if (c==' ') {
                if (space == false) {
                    space = true;
                    temp.append(c);
                }
            }
            
        }
          
        answer = temp.toString();
        return answer;
    }
}
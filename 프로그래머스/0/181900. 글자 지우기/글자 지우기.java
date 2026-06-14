import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for (int j = 0; j < my_string.length(); j++) {
            boolean remove = false;

            for (int i = 0; i < indices.length; i++) {
                if (indices[i] == j) {
                    remove = true;
                    break;
                }
            }

            if (!remove) {
                answer += my_string.charAt(j);
            }
            
        }
        return answer;
    }
}
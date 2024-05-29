import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        if(st.countTokens() == 0)
            return new String[] {"EMPTY"};
        
        String[] answer = new String[st.countTokens()];
        for(int i=0; i<answer.length; i++)
            answer[i] = st.nextToken();
        return answer;
    }
}
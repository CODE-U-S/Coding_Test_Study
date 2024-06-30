import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long lp = Long.parseLong(p);
        for(int i=0; i<=t.length()-p.length(); i++){
            long lt = Long.parseLong(t.substring(i, i+p.length()));
            if(lt <= lp)
                answer++;
        }
        return answer;
    }
}
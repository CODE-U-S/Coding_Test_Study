import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        for(int i = str.length - 1; i >= 0; i--) 
            answer += str[i];
        
        return answer;
    }
}

public class StringReverseSort {
    public static void main(String args[]) {
        String a = "ZbcdefgD";
        Solution s = new Solution();
        String result = s.solution(a);
        System.out.println(result);
    }
}
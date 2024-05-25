import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str);
        s = "";
        for(int i=str.length-1; i>=0; i--)
            s+= str[i];
        return s;
    }
}
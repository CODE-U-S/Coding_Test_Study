import java.util.*;
class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        String[] str = s.split("");
        Arrays.sort(str);
        s = "";
        for(int i = str.length-1; i>=0; i--)
            s+= str[i];
        return Long.parseLong(s);
    }
}
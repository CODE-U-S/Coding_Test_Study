import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new StringBuilder(new String(temp)).reverse().toString();
    }
}
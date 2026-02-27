import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] suffixes = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            suffixes[i] = my_string.substring(i);
        }
        Arrays.sort(suffixes);
        return suffixes;
    }
}
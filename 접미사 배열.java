import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] suffixes = new String[len];

        for (int i = 0; i < len; i++) {
            suffixes[i] = my_string.substring(i);
        }

        Arrays.sort(suffixes);

        return suffixes;
    }
}

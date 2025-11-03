import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String temp[] = Long.toString(n).split("");
        Arrays.sort(temp);
        StringBuilder t = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            t.append(temp[i]);
        }
        return Long.valueOf(t.toString());
    }
}
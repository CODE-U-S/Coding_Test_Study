import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {

        char[] b = before.toCharArray();
        char[] a = after.toCharArray();

        Arrays.sort(b);
        Arrays.sort(a);

        if (Arrays.equals(b, a)) {
            return 1;
        }

        return 0;
    }
}
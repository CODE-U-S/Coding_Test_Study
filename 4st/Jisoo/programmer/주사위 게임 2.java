public class Solution {
    public int solution(int a, int b, int c) {
        int result = 0;
        if (a != b && b != c && a != c) {
            result = a + b + c;
        }
        else if (a == b && b == c) {
            int sum1 = a + b + c;
            int sum2 = (a*a) + (b*b) + (c*c);
            int sum3 = (a*a*a) + (b*b*b) + (c*c*c);
            result = sum1 * sum2 * sum3;
        }
        else {
            int sum1 = a + b + c;
            int sum2 = (a*a) + (b*b) + (c*c);
            result = sum1 * sum2;
        }

        return result;
    }
}

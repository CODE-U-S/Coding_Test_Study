class Solution {
    public int solution(int n) {
        int result = 0;
        if (n >= 1 && n <= 100) {
            if (n % 7 == 0) {
                result = n / 7;
            } else {
                result = n / 7 + 1;
            }
        }
        return result;
    }
}
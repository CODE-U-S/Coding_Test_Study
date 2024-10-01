class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        for (; i <= j; i++) {
            int n = i;
            while (n > 0) {
                if (n % 10 == k) {
                    result++;
                }
                n /= 10;
            }
        }
        return result;
    }
}
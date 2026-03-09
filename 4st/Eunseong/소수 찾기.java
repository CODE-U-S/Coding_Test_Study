class Solution {
    public int solution(int n) {
        int cnt = 0;
        Outer : for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue Outer;
                }
            }
            cnt++;
        }
        return cnt;
    }
}
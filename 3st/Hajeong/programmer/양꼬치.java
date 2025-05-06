class Solution {
    public int solution(int n, int k) {
        int answer = 12000 * n + 2000 * k;
        int m = 2000 * (n / 10);
        return answer - m;
    }
}
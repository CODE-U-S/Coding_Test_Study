class Solution {
    public int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n = n * 2;
        }
        return n;
    }
}
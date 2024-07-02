package Sunhee.programmers;

class Solution {
    public int[] solution(int n, int m) {
        // 최대 공약수
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
 
        // 최대 공배수 = 두 수의 곱 / 최대공약수
        return new int[] { a, n * m / a };
    }
}
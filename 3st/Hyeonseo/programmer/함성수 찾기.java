class Solution {
    public int solution(int n) {
        int count = 0; // 합성수 개수

        for (int i = 4; i <= n; i++) {
            if (!isPrime(i)) { // 소수가 아니면 (합성수면)
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) { // 제곱근까지만 검사
            if (num % i == 0) return false; 
        }
        return true;
    }
}

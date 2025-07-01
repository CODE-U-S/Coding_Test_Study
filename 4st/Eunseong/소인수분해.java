class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        boolean isSosu = true;
        int m = n;
        for (int i = 2; i <= m; i++) {
            isSosu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                if (n % i == 0) cnt++;
                while (m % i == 0) {
                    m /= i;
                }
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for (int i = 2; i <= n; i++) {
            isSosu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                if (n % i == 0) {
                    answer[cnt++] = i;
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
        }
        return answer;
    }
}
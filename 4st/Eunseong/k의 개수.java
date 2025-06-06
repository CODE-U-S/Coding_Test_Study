class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            for (int m = l; m > 0; m /= 10) {
                if (m % 10 == k) answer++;
            }
        }

        return answer;
    }
}
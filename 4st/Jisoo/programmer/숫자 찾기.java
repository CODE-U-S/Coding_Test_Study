class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int temp = num;

        while (temp > 0) {
            answer++;
            temp /= 10;
        }

        temp = num;

        for (int i = answer; i >= 1; i--) {
            int div = 1;
            for (int j = 1; j < i; j++) div *= 10;

            if (temp / div == k) return answer - i + 1;
            temp %= div;
        }

        return -1;
    }
}
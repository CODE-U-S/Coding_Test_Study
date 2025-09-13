class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int sum = n;
        while (sum != 1) {
            if (sum % 2 == 0) {
                sum /= 2;
            } else {
                sum *= 3;
                sum++;
            }
            cnt++;
        }
        int[] answer = new int[++cnt];
        sum = n;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sum;
            if (sum % 2 == 0) {
                sum /= 2;
            } else {
                sum *= 3;
                sum++;
            }
        }
        return answer;
    }
}
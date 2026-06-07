class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long k = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = k;
            k += x;
        }

        return answer;
    }
}
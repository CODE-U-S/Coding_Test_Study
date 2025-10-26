class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }
}
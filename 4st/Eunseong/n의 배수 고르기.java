class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        for (int i : numlist) {
            if (i % n == 0) cnt++;
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for (int i : numlist) {
            if (i % n == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}
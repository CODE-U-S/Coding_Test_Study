class Solution {
    public int[] solution(int num, int total) {
        int answer[] = new int[num];
        if (num % 2 == 0) {
            int cnt = total / num - num / 2 + 1;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = cnt++;
            }
        } else {
            int cnt = total / num - num / 2;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = cnt++;
            }
        }
        return answer;
    }
}
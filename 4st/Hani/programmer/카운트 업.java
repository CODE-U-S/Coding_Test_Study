class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = 0; i <= (end_num - start_num); i++) {
            for (int j = start_num; j <= end_num; j++) {
                answer[i] = start_num + i;
            }
        }
        return answer;
    }
}
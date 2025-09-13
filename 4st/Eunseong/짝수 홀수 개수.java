class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};

        for (int i = 0; i <= num_list.length - 1; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }

        return answer;
    }
}
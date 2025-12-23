class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
            answer = answer - 1;
        }
        else if (num_list.length < 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer = answer * num_list[i];
            }
        }
        return answer;
    }
}
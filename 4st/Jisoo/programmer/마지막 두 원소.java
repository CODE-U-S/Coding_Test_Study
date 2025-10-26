import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list[num_list.length - 2], b = num_list[num_list.length - 1];
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length - 1] = b > a ? b - a : b * 2;
        return answer;
    }
}
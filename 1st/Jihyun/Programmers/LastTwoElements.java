class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

        for (int i = 0; i < len; i++)
            answer[i] = num_list[i];

        answer[len] = (num_list[len - 1] > num_list[len - 2]) ? num_list[len - 1] - num_list[len - 2]
                : num_list[len - 1] * 2;

        return answer;
    }
}

public class LastTwoElements {
    public static void main(String args[]) {
        int[] num_list = { 2, 1, 6 };
        Solution s = new Solution();
        int[] list = s.solution(num_list);
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}
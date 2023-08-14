package Hyeseung.Programmers;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];

        if (last > before)
            answer[answer.length - 1] = last - before;
        else
            answer[answer.length - 1] = last * 2;

        return answer;
    }
}
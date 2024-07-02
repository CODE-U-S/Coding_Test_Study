package Hyeseung.Programmers;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++)
            answer[i - start] = i;
        return answer;
    }
}

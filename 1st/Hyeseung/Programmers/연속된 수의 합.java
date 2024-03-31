class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total / num) - ((num - 1) / 2);
        for(int i = 0; i < answer.length; i++, start++) answer[i] = start;
        return answer;
    }
}
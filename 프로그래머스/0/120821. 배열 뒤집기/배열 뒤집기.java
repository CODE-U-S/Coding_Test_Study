class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++) {
            answer[num_list.length - 1 - i] = num_list[i];
        }
        return answer;
    }
}
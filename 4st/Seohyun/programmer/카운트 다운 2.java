class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        
        answer[0]=start_num;
        for(int i=1; i<answer.length; i++) {
            answer[i]=answer[i-1]-1;
        }
        return answer;
    }
}
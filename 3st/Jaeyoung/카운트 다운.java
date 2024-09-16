class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        int length=start_num-end_num+1;
        for(int i=0; i<length; i++){
            answer[i]=start_num;
            start_num--;
        }
        return answer;
    }
}
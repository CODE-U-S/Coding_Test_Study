class Solution {
    public int[] solution(int start_num, int end_num) {
        int size=end_num-start_num+1;
        int[] answer = new int[size];
        for(int i=0;i<size;i++){
            answer[i]=start_num+i;
        }
        return answer;
    }
}
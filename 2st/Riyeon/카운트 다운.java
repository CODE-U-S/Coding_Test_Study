class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        int cnt=0;
        for(int i=start; i>=end_num; i--, cnt++)
            answer[cnt] = i;
        return answer;
    }
}
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0] != date2[0]){
            answer = date1[0]<date2[0]? 1 : 0;
        }else if(date1[1] != date2[1]){
            answer = date1[1]<date2[1]? 1 : 0;
        }else
            answer = date1[2]<date2[2]? 1 : 0;
        return answer;
    }
}
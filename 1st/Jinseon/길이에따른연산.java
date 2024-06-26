class Solution {
    public int solution(int[] num_list) {
        int answer = num_list.length;
        if(answer > 10){
            answer = 0;
            for(int i = 0; i < num_list.length; i++){
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for(int i = 0; i < num_list.length; i++){
                answer *= num_list[i];
            }
        }
        return answer;
    }
}

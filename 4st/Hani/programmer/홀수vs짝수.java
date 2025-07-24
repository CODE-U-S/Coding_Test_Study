class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;   //홀수
        int odd = 0;    //짝수
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 1) {
               even += num_list[i];
            }
            else if (i % 2 == 0) {
               odd += num_list[i];
           }
        }
        if (even > odd) 
            answer = even;
        else 
            answer = odd;
        return answer; 
    }
}
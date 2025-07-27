class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<num_list.length; i++) {
            if(i%2==0) {     //홀수
                sum+=num_list[i];
            }
            else if(i%2!=0) {       //짝수
                answer+=num_list[i];
            }
        }
        answer= (answer>sum) ? answer : sum;
        return answer;
    }
}
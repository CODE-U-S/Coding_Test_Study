class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0, once = 1;
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            once *= num_list[i];
        }
        sum *= sum;
        if(sum > once) return 1;
        return answer;
    }
}
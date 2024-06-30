class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            for(int j = num_list[i]; j > 1; j = num_list[i]){
                if(num_list[i] % 2 == 0) num_list[i] = num_list[i] / 2;
                else num_list[i] = (num_list[i] - 1) / 2;
                answer++;
            }
        }
        return answer;
    }
}

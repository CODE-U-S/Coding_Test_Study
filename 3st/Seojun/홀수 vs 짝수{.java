class Solution {
    public int solution(int[] num_list) {
        int sum1 =0;
        int sum2 =0;
        int lsum =0;
        for(int i =0; i<num_list.length;i++){
            if(i %2==1){
                sum1 +=num_list[i];
            }
            
            else if(i %2==0){
                sum2 +=num_list[i];
            }
            
            if(sum1>sum2) lsum = sum1;
            else  lsum = sum2;
        }
        int answer = lsum;
        return answer;
    }
}i
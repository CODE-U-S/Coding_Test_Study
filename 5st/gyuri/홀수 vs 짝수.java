class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
         int oddSum = 0;
        int evenSum = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i % 2 == 0){
                oddSum += num_list[i];
            }else {
                evenSum += num_list[i];
            }
        }
            
        return Math.max(oddSum, evenSum);
    }
}
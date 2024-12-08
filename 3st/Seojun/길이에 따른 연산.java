class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gop =1;
        int du = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list.length>=11){
                du += num_list[i];
                answer = du;
            }
            else if(num_list.length<=10){
                gop *=num_list[i];
                answer  = gop;
            }
        }
        
        return answer;
    }
}
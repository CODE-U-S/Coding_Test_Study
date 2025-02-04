class Solution {
    public int solution(int[] num_list) {
        int as=0;
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]<0){
                as=i;
                break;
            }
            else if(num_list[i]>=0){
                as=-1;
            }
            
        }
        answer=as;
        return answer;
    }
}
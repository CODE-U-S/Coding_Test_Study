class Solution {
    public int solution(int[] num_list, int n) {
        int ans=0;
        for(int i =0; i<num_list.length;i++){
            if(num_list[i]==n){
                ans=1;
                break;
            }
            else if(num_list[i]!=n){
                ans=0;
            }
           
        }
        int answer = ans;
        return answer;
      
    }
}
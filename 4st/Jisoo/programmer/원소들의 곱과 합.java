class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int p=1;
        for(int i : num_list){
            answer+=i;
            p*=i;
        }
        if(p<answer*answer){
            return 1;
        }
        else{
            return 0;
        }
    }
}
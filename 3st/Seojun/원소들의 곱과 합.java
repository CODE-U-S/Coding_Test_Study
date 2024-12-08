class Solution {
    public int solution(int[] num_list) {
        int n=1;
        int sum=0;
        int as =0;
        for(int i =0;i<num_list.length;i++){
            n*=num_list[i];
            sum+=num_list[i];
            if(n<(sum*sum)) as=1;
            else if(n>(sum*sum)) as=0;
        }
        int answer = as;
        return answer;
    }
}
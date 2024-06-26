class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int sum=0;
            for(int j=i; sum<=n; j++){
                sum += j;
                if(sum==n){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
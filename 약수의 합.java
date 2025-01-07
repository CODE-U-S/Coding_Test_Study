class Solution {
    public int solution(int n) {
        int as=0;
        for(int i =1; i<=n; i++){
            if(n%i==0) as+=i;
        }
        
        int answer = as;
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++) {
            if(i*6%n==0) {
                 answer = i;
                break;
            }
        }
        return answer;
    }
}
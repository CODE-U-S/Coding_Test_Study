class Solution {
    public int solution(int n) {
        int answer = 0;
        for(answer = 2; answer < n; answer++)
            if(n % answer == 1) break;
        return answer;
    }
}

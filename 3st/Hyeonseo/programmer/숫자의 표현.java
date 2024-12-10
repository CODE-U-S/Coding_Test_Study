class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = 0;
            for(int j = i; j <= n; j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                }
                if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}

//level 2

class Solution {
    public int solution(int n) {
        int answer[] = new int[n+1];
        for ( int i = 0 ; i <= n ; i++ ) {
            if ( i == 0 ) answer[i] = 0;
            if ( i == 1 ) answer[i] = 1;
            if ( i >= 2 ) {
                answer[i] = (answer[i-1] + answer[i-2])%1234567;
            }
        }
        return answer[n];
    }
}
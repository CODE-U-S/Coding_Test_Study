class Solution {
    public int solution(int n, int k) {
        int answer = ( n*12000 ) + ( k*2000 );
        for ( int i = 1 ; i <= n ; i++ )
            if ( i%10 == 0 ) answer-=2000;
        return answer;
    }
}
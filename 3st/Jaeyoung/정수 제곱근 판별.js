function solution(n) {
    var answer = 0;
    for ( var i = 1 ; i <= n ; i++ ) {
        if ( (i*i) == n ) {
            answer = (i+1)*(i+1);
            break;
        }
        else answer = -1;
    }
    return answer;
}
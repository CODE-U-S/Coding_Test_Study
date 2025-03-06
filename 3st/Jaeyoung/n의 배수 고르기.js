function solution(n, numlist) {
    var answer = [];
    var j = 0;
    for ( var i = 0 ; i < numlist.length ; i++ ) 
        if ( numlist[i]%n == 0 ) answer[j++] = numlist[i];
    return answer;
}
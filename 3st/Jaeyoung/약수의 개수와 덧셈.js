function solution(left, right) {
    var answer = 0
    for ( var i = left ; i <= right ; i++ ) {
        Number.isInteger(Math.sqrt(i)) ? answer -= i : answer += i;
    }
    return answer;
}
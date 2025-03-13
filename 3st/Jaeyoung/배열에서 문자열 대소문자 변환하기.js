function solution(strArr) {
    var answer = [];
    for( var i = 0 ; i < strArr.length ; i++ ) {
        i%2 == 0 ? answer[i] = strArr[i].toLowerCase() : answer[i] = strArr[i].toUpperCase()
    }
    return answer;
}
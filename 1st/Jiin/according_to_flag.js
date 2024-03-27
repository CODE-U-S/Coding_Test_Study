function solution(a, b, flag) {
    var answer = 0;
    if(flag)
        answer = a + b;
    else
        answer = a - b;
    return answer;
}
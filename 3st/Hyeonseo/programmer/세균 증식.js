function solution(n, t) {
    var answer = n;
    for(let i = 1; i <= t; i++){
        answer *= 2;
    }
    return answer;
}
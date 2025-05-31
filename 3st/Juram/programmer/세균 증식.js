function solution(n, t) {
    var answer = 1;  
    var cnt = 1;
    for(let i=1; i<=t; i++){
        answer=n*cnt;
        cnt*=2;
    }
    return answer*2;
}
function solution(n) {
    var answer = [];
    for(let i=1; i<=n; i++){
        if(n%i===0){
            answer.push(i);
        }
    }
    return answer;
}
function solution(n) {
    var answer = [];
    answer.push(n);
    do{
        if(n%2===0)
            n /= 2;
        else
            n = n*3+1;
        answer.push(n);
    }while(n !== 1)
    return answer;
}
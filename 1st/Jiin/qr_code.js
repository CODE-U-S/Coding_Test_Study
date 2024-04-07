function solution(q, r, code) {
    var answer = '';
    
    do{
        answer += code[r];
        code = code.substr(q);
    }while(code.length >= q || code.length % q > r);
    
    return answer;
}

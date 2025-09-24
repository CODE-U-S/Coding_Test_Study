function solution(binomial) {
    var answer = 0;
    var bi = binomial.split(' ');
    switch(bi[1]){
        case "+": 
            answer = Number(bi[0])+Number(bi[2]);
            break;
        case "-": 
            answer = Number(bi[0])-Number(bi[2]);
            break;
        case "*": 
            answer = Number(bi[0])*Number(bi[2]);
            break;
    }
    return answer;
    
}
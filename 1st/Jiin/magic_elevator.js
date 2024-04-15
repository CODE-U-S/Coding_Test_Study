function solution(storey) {
    var answer = 0;
    
    while(storey != 0){
        if(storey % 10 > 5){
            answer += 10 - storey % 10;
            storey = Math.trunc(storey / 10);
            storey++;
        }else if(storey % 10 == 5 && Math.trunc(storey / 10) % 10 >= 5){
            answer += 5;
            storey = Math.trunc(storey / 10);
            storey++;
        }else{
            answer += storey % 10;
            storey = Math.trunc(storey / 10);
        }
    }
    
    return answer;
}

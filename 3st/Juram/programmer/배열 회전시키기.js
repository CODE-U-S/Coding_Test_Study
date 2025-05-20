function solution(numbers, direction) {
    var answer = [];
    if(direction == "right"){
        for(let i=1; i<numbers.length; i++){
            answer[0] = numbers[numbers.length-1];
            answer.push(numbers[i-1]);
        }
    }
    else if(direction == "left"){
        for(let i=1; i<numbers.length; i++){
            answer.push(numbers[i]);
        }
        answer.push(numbers[0]);
        
    }
    return answer;
}
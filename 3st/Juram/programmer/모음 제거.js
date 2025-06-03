function solution(my_string) {
    var answer = '';
    for(let i=0; i<my_string.length; i++){
        switch(my_string[i]){
            case "a": case "e": case "i": case "o": case "u":
                continue;
            default:answer+=my_string[i]
        }
        
    }
    return answer;
}
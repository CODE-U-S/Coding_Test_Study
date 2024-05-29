function solution(s) {
    let answer = 0;
    let x = s[0];
    let x_sum = 0, not_x_sum = 0;
    
    for(let word of s){
        if(x_sum === not_x_sum){
            answer++;
            x_sum = 0;
            not_x_sum = 0;
            x = word;
        }
        
        if(word === x) x_sum++;
        else not_x_sum++;
    }
    
    return answer;
}

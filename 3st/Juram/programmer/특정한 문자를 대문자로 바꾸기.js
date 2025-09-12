function solution(my_string, alp) {
    var answer = '';
    for(let x in my_string){
        if (my_string[x] == alp) answer += my_string[x].toUpperCase();
        else answer += my_string[x];
    }
    return answer;
}
function solution(num_list) {
    var answer = 0;
    if(num_list.length <= 10){
        answer = 1;
        num_list.forEach((e) => answer *= e );
    } 
    else
        num_list.forEach((e) => answer += e );
    return answer;
}

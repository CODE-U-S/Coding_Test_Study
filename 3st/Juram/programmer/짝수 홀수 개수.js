function solution(num_list) {
    var answer = [0,0];
    for(let i=0; i<num_list.length; i++){
        if(num_list[i]%2==0) answer[0]++;
        else answer[1]++;
    }
    return answer;
}
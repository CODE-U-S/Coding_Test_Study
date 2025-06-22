function solution(my_string, n) {
    var answer = '';
    for(let i=my_string.length-1; i>my_string.length-1-n; i--){
        answer+=my_string[i];
    }
    return answer.split('').reverse().join('');
}
function solution(my_string) {
    var answer = 0;
    let num = my_string.replace(/[^0-9]/g, "");
    for(let n of num){
        n = parseInt(n);
        answer+=n;
    }
    return answer;
}
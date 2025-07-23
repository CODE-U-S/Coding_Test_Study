function solution(my_string) {
    let answer = [];
    let num = my_string.replace(/[^0-9]/g, "");
    for(let n of num){
        n = Number(n);
        answer.push(n);
    }
    answer.sort();
   
   
    return answer;
}
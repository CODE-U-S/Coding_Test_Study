function solution(n) {
    let answer = 0;
    var arr = n.toString().split("");
    for(let i=0; i<arr.length; i++){
        answer+=parseInt(arr[i]);
    }
    return answer;
}
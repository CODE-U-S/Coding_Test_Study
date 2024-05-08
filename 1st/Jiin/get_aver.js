function solution(arr) {
    var answer = 0;
    arr.forEach(n => {
       answer += n; 
    });
    return answer / arr.length;
}

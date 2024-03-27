function solution(t, p) {
    var answer = 0;
    var num, temp;
    for(let i = 0; i <= t.length - p.length; i++){
        num = 0;
        temp = 1;
        for(let j = i; j < i+p.length; j++){
            num += t[j] * Math.pow(10, p.length-temp); 
            temp++;
        }
        if(num <= p) answer++;
    }
    return answer;
}

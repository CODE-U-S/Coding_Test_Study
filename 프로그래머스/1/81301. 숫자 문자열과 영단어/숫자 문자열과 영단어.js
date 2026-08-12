function solution(s) {
    var answer = 0;
    
    let num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
    for (let i in num) {
        s = s.replaceAll(num[i], i.toString());
    }
    
    answer = Number(s);
    
    return answer;
}
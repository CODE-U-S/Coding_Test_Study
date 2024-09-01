function solution(numbers) {
    var answer = [numbers.length];
    for ( var i = 0 ; i < numbers.length ; i++ ) {
        answer[i] = numbers[i]*2;
    }
    return answer;
}
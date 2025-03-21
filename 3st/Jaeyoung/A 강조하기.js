function solution(myString) {
    var answer = '';
    answer = myString.split('')
    for( var i = 0 ; i < answer.length ; i++ ) {
        if( answer[i] === "a" || answer[i] === "A" ) answer[i] = answer[i].toUpperCase();
        else answer[i] = answer[i].toLowerCase();
    }
    return answer.join('');
}0
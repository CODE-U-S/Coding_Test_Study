function solution(my_string, letter) {
    let answer = [];
    for ( var i = 0 ; i < my_string.length ; i++ ) {
        if ( my_string[i] == letter ) continue;
        else answer.push(my_string[i]);
    }
    
    return answer.join("");
}
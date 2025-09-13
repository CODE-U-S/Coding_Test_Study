function solution(my_string) {
    var answer = [];
    for( x of my_string ) {
        if( x >= 0 ) answer.push( parseInt( x ) )
    }
    return answer.sort();
}
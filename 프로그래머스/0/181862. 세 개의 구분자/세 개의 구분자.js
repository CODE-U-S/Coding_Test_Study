function solution(myStr) {
    var answer = [];
    let word = "";
    for (let i = 0; i < myStr.length; i++) {
        if (myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c') {
            word += myStr.charAt(i);
        }
        else if (myStr.charAt(i) === 'a' || myStr.charAt(i) === 'b' || myStr.charAt(i) === 'c') {
            if (word != "") {
                answer.push(word);
                word = "";
            }
        }
    }
    if (word != "") {
        answer.push(word);
    }
    if (answer.length === 0) {
        answer.push("EMPTY")
    }
    return answer;
}
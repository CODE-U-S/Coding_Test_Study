function solution(myString) {
    var answer = [];
    myString = myString.split("x");
    for(var i of myString)
        answer.push(i.length);
    return answer;
}

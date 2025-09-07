function solution(myString) {
    var answer = [];
    var sliceX = [];
    sliceX = myString.split("x");
    for(let i=0; i<sliceX.length; i++){
        answer.push(sliceX[i].length);
    }
    return answer;
}
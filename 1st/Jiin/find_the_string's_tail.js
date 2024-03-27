function solution(myString, pat) {
    var answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length);
    return answer;
}
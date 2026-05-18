function solution(my_string) {
  var answer = "";

  for (let ch of my_string) {
    if (ch != "a" && ch != "e" && ch != "i" && ch != "o" && ch != "u") {
      answer += ch;
    }
  }

  return answer;
}

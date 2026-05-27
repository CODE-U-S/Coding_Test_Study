function solution(start, end) {
  var answer = [];

  for (let i = start; i >= end; i--) {
    answer.push(i);
  }
  return answer;
}

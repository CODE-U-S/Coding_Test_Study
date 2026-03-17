function solution(n) {
  var answer = 0;

  for (let i = 0; i <= n; i += 2) {
    answer += i;
  }
  return answer;
}

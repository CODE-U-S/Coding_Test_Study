function solution(n) {
  let answer = 0;

  if (n % 2 !== 0) {
    for (let i = n; n >= 0; n -= 2) {
      answer += n;
    }
    return answer;
  }

  if (n % 2 === 0) {
    for (let i = n; n >= 0; n -= 2) {
      answer += n * n;
    }
    return answer;
  }

  return answer;
}

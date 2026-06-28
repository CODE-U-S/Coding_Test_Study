function solution(arr) {
  let answer = [];

  for (let n of arr) {
    if (answer.length === 0) {
      answer.push(n);
    } else {
      if (n === answer[answer.length - 1]) {
        answer.pop();
        answer.push(n);
      } else {
        answer.push(n);
      }
    }
  }
  return answer;
}

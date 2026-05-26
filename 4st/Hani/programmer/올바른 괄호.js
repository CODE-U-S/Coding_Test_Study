function solution(s) {
  var answer = true;
  let stack = [];

  for (let i of s) {
    if (i === "(") {
      stack.push(i);
    } else if (i === ")") {
      if (stack.length === 0) {
        answer = false;
        return answer;
      }
      stack.pop(i);
    }
  }
  if (stack.length === 0) {
    return answer;
  } else {
    answer = false;
    return answer;
  }
}

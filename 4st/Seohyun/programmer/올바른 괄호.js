function solution(s) {
  let stack = [];

  if (s.charAt(0) === ")") return false;

  for (const parens of s) {
    if (parens === "(") {
      stack.push(parens);
    } else {
      stack.pop();
    }
  }
  if (stack.length === 0) return true;

  return false;
}

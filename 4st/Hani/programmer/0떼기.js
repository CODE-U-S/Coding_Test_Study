function solution(n_str) {
  let answer = "";

  let start = false;
  for (let i in n_str) {
    if (n_str[i] !== "0") {
      start = true;
      num = i;
      break;
    }
  }
  for (let i = num; i < n_str.length; i++) {
    answer += n_str[i];
  }

  return answer;
}

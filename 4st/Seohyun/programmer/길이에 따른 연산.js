function solution(num_list) {
  let answer = num_list.length >= 11 ? 0 : 1;

  if (num_list.length >= 11) {
    for (const i of num_list) {
      answer += i;
    }
  } else {
    for (const i of num_list) {
      answer *= i;
    }
  }
  return answer;
}

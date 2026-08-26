function solution(my_string, s, e) {
  let answer = "";

  for (let i = 0; i < my_string.length; i++) {
    if (i < s) {
      answer += my_string.charAt(i);
    } else if (i >= s && i <= e) {
      for (let j = e; j >= s; j--) {
        answer += my_string.charAt(j);
      }
      i = e;
    } else {
      answer += my_string.charAt(i);
    }
  }
  return answer;
}

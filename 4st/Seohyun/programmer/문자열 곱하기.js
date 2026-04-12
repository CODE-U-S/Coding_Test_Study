function solution(my_string, k) {
  var answer = "";

  for (let i = 0; i < k; i++) {
    answer += my_string;
  }
  return answer;
  //return my_string.repeat(k);
}

function solution(array, height) {
  var answer = 0;

  for (let k of array) {
    if (k > height) {
      answer++;
    }
  }
  return answer;
}

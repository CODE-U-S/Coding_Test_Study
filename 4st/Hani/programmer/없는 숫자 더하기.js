function solution(numbers) {
  var answer = 0;

  numbers.sort();

  for (let i = 0; i <= 9; i++) {
    if (!numbers.includes(i)) {
      answer += i;
    }
  }
  return answer;
}

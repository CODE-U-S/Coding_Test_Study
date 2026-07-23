function solution(my_string) {
  let arr = my_string.split(" ");
  let answer = arr.filter((letter) => letter.trim() !== "");
  return answer;
}

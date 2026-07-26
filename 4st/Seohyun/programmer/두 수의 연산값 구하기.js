function solution(a, b) {
  let temp1 = parseInt(a.toString() + b.toString());
  let temp2 = 2 * a * b;

  return temp1 > temp2 ? temp1 : temp2;
}

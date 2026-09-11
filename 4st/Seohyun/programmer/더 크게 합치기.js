function solution(a, b) {
  let str1 = parseInt(a.toString() + b.toString(), 10);
  let str2 = parseInt(b.toString() + a.toString(), 10);

  return str1 > str2 ? str1 : str2;
}

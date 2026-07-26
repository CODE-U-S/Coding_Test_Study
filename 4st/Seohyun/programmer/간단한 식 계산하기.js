function solution(binomial) {
  let num = binomial.split(" ");

  let n1 = parseInt(num[0]);
  let n2 = parseInt(num[2]);
  let op = num[1];

  if (op === "+") return n1 + n2;
  else if (op === "-") return n1 - n2;
  else if (op === "*") return n1 * n2;
}

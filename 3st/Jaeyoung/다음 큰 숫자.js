function solution(n) {
    let oneNum = n.toString(2).split("1").length;
    while (true) {
      n++;
      if (n.toString(2).split("1").length === oneNum) return n;
    }
  }
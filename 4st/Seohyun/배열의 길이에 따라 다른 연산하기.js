function solution(arr, n) {
  return arr.map((num, index) =>
    index % 2 !== arr.length % 2 ? num + n : num,
  );
}

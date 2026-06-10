function solution(array, commands) {
  let answer = [];

  for (let i = 0; i < commands.length; i++) {
    let ii = commands[i][0];
    let jj = commands[i][1];
    let kk = commands[i][2];

    let arr = array.slice(ii - 1, jj);

    arr.sort((a, b) => a - b);

    answer.push(arr[kk - 1]);
  }

  return answer;
}

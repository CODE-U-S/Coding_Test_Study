function solution(triangle) {
    for (let i = 1; i < triangle.length; i++) {
      for (let j = 0; j < triangle[i].length; j++) {
        const firstCase = triangle[i - 1][j - 1] ?? 0;
        const secondCase = triangle[i - 1][j] ?? 0;
  
        if (secondCase >= firstCase) {
          triangle[i][j] += secondCase;
          continue;
        }
        triangle[i][j] += firstCase;
      }
    }
    return Math.max(...triangle.at(-1));
  }
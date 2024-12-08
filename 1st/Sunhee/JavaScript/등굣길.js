function solution(m, n, puddles) {
    const MOD = 1000000007;

    let dp = Array.from({ length: n }, () => Array(m).fill(0));

    dp[0][0] = 1;

    for (let [x, y] of puddles) {
        dp[y - 1][x - 1] = -1; 
    }

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (i === 0 && j === 0) continue;

            if (dp[i][j] === -1) {
                dp[i][j] = 0;
                continue;
            }

            if (i > 0) dp[i][j] += dp[i - 1][j];
            if (j > 0) dp[i][j] += dp[i][j - 1];

            dp[i][j] %= MOD; 
        }
    }

    return dp[n - 1][m - 1];
}


console.log(solution(4, 3, [[2, 2]])); 

function solution(n) {
    const answer = n => [...Array(n+1).keys()].reduce((sum, i) =>
                   n%i === 0 ? sum += i : sum, 0);
    return answer(n);
}
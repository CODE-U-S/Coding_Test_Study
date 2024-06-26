function solution(a, b) { 
    return (a%2 === b%2) ? ((a%2 === 1) ? a**2 + b**2 : Math.abs(a-b)) : (a + b) * 2;
}

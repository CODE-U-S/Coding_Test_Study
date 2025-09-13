function solution(a, b) {
    a = a.toString();
    b = b.toString();
    if(a+b > b+a || a+b == b+a) return parseInt(a+b);
    return parseInt(b+a);
}
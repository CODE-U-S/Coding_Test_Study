function solution(a, b) {
    var one = a*b*2;
    a = a.toString();
    b = b.toString();
    var two = a+b;
    two = parseInt(two);
    if(one>two) return one;
    else return two;
}
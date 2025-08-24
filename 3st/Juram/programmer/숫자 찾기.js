function solution(num, k) {
    let numArr = num.toString().split("");
    k = k.toString();
    if(numArr.includes(k)) return numArr.indexOf(k)+1;
    else return -1;
}
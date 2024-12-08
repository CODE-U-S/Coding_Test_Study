function countOne(num) {
    let count = 0, ejin = num.toString(2).split('');
    for(let i = 0; i < ejin.length; i++) {
        if (ejin[i] == 1) { count++; }
    }
    return count; 
}

function solution(n) {
    let testNum = n;
    while(true) {
        testNum++; 
        if(countOne(testNum) == countOne(n)) return testNum;
    }
}
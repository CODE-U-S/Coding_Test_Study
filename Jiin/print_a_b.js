const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    //내가 작성 시작한 부분
    console.log("a = "+input[0]);
    console.log("b = "+input[1]);
});
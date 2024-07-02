
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
let answer = "";

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];

    for(let char of str){
        if(char === char.toUpperCase()) 
            answer+=char.toLowerCase();
        else
            answer+=char.toUpperCase();
    }

    console.log(answer);
});

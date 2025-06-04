function solution(sides) {
    let max = 0;
    let sum = 0;
    let idx = 0;
    for(let i=0; i<sides.length; i++){
        if(sides[i]>max){
            max = sides[i];
            idx = i;
        }
    }
    for(let i=0; i<sides.length; i++){
        if(idx == i) continue;
        sum += sides[i];
    }
    if(sum<=max) return 2;
    else return 1;
}
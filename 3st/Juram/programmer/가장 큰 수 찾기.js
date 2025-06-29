function solution(array) {
    var answer = [];
    let max;
    let idx;
    for(let i=0; i<array.length-1; i++){
        for(let j=1; j<array.length; j++){
            if(array[i]<array[j]){
                max = array[j];
                idx = j;
            }
            else{
                max = array[i];
                idx = i;
            }
        }
    }
    answer.push(max);
    answer.push(idx);
    
    return answer;
}
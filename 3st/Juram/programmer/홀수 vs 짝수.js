function solution(num_list) {
    var oddSum = 0;
    var evenSum = 0;
    for(let i=0; i<num_list.length; i+=2){
        evenSum += num_list[i];
    }
    for(let i=1; i<num_list.length; i+=2){
        oddSum += num_list[i];
    }
    if(oddSum > evenSum) return oddSum;
    else if(oddSum < evenSum) return evenSum;
    else return evenSum;
}
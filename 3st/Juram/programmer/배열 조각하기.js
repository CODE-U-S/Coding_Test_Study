function solution(arr, query) {
    var answer = arr;
    for(let i=1; i<query.length; i++){
        if(i%2==0){
            answer = answer.slice(0,query[i]+1);
        }
        else if(i%2!=0){
            answer = answer.slice(query[i]);
        }
    }
    return answer;
}
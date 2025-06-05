function solution(array, height) {
    var answer = 0;
       for(let arr of array){
            if(arr > height){
            answer++;
        }
    }
    return answer;
}
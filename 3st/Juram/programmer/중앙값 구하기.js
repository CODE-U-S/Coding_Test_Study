function solution(array) {
    var answer = 0;
    array.sort((a,b)=>a-b);
    if(array.length % 2 != 0){
        return array[Math.floor(array.length/2)]
    }else{
        return (array[parseInt(array.length/2-1)+1]+array[parseInt(array.length/2)])/2;
    }
    return answer;
}
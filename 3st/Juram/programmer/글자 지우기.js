function solution(my_string, indices) {
    var answer = '';
    var strArr = my_string.split('');
     indices.sort((a, b) => b - a);
    for(let i=0; i<indices.length; i++){
        strArr.splice(indices[i],1);
    }
    answer = strArr.join('');
    return answer;
}
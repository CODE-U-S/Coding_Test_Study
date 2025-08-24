function solution(num_list) {
    var answer = [];
    let lastIndex = num_list.length-1;
    if(num_list[lastIndex-1] < num_list[lastIndex]) {
        num_list.push(num_list[lastIndex]-num_list[lastIndex-1]);
    }
    else{
        num_list.push(num_list[lastIndex]*2);
    }
    answer = num_list;
    return answer;
}
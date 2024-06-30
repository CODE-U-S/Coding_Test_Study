function solution(array, commands) {
    let answer = [];
    let passing_array = [];
    let i = 0;
    
    for(let command of commands){
        passing_array.push(array.slice(command[0] - 1, command[1]));                // array 자르기
        passing_array[i] = passing_array[i].sort((first, second) => first - second);// 오름차순으로 정렬
        answer.push(passing_array[i++][command[2] - 1]);                            // answer배열에 삽입
    }
    
    return answer;
}

function solution(str_list, ex) {
    var answer = '';
    str_list.forEach((str) => {
        if(!str.includes(ex)) {
            answer+= str;
        }
    });
    return answer;
}
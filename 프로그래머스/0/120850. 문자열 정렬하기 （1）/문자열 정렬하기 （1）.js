function solution(my_string) {
    var answer = [];

    for (let i = 0; i < my_string.length; i++) {
        let ch = my_string[i];
        if (!isNaN(ch) && ch !== ' ') {
            answer.push(Number(ch));
        }
    }
    answer.sort((a, b) => a - b);
    return answer;
}

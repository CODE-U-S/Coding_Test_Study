function solution(my_string) {
    var answer = '';
    var lower = my_string.toLowerCase();
    const arr = lower.split("");
    arr.sort();
    answer = arr.join("");
    return answer;
}
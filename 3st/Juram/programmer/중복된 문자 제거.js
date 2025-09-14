function solution(my_string) {
    let strArr = my_string.split('');
    let setArr = [...new Set(strArr)];
    return setArr.join('');
}
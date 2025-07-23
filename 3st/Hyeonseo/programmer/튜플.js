function solution(s) {
    var answer = [];
    s = s.slice(2, s.length - 2); 

    let arr = s.split("},{");

    let sets = arr.map(str => str.split(',').map(Number));
    sets.sort((a, b) => a.length - b.length);
    sets.forEach(arr => {
        arr.forEach(num => {
            if (!answer.includes(num)) {
                answer.push(num);
            }
        });
    });
    return answer;
}

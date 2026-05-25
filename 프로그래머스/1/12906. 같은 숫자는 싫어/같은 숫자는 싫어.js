function solution(arr)
{
    var answer = [arr[0]];
    let before = arr[0];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] !== before) {
            answer.push(arr[i]);
        }
        before = arr[i];
            
    }
    
    return answer;
}
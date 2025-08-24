function solution(n_str) {
    var answer = '';
    let cnt = 0;
    for(let i=0; i<n_str.length; i++){
        if(n_str[i]==0) cnt++;
        else break;
    }
    answer = n_str.slice(cnt,n_str.length);
    
    return answer;
}
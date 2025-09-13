function solution(num_list) {
    let a = 0;
    let b = 1;
    for(let num of num_list){
        a+=num;
        b*=num;
    }
    if(b<a*a){
        return 1;
    }
    else return 0;
}
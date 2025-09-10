function solution(num_list) {
    var odd = "";
    var even = "";
    var toStr = "";
    for(let i=0; i<num_list.length; i++){
        if(num_list[i]%2==0){
            toStr = num_list[i].toString();
            even += toStr;
        }else{
            toStr = num_list[i].toString();
            odd += toStr;  
        }
    }
    return Number(even)+Number(odd);
}
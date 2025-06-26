function solution(rsp) {
    let answer = [];
    rsp.split();
    for(let i=0; i<rsp.length; i++){
        if(rsp[i]=="2") answer.push("0");
        else if(rsp[i]=="5") answer.push("2");
        else answer.push("5");
    }
    return answer.join("");
}
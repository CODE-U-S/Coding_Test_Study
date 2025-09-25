function solution(myString, pat) {
    var answer = 0;
    var change = "";
    for(let i=0; i<myString.length; i++){
        if(myString[i]=="A") change += "B";
        else change += "A";
    }
    if(change.includes(pat)) return 1;
    else return 0;
}
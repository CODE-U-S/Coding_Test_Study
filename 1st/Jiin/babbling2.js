function solution(babbling) {
    let speaking = ['aya', 'ye', 'woo', 'ma'];
    let answer = 0;
    let limit = 0;
    let distinct = -1;
    
    for(let blabla of babbling){
        distinct = -1;
        
        while(true){
            limit = 0;
            
            for(let speak of speaking){
                if(blabla.indexOf(speak) === 0 && distinct !== speaking.indexOf(speak)){
                    blabla = blabla.substring(speak.length);
                    distinct = speaking.indexOf(speak);
                    break;
                }else 
                    limit++;
            }//inner for
            
            if(limit === 4) break;
            if(blabla.length === 0){
                answer++;
                break;
            }
            
        }//while
    }//outter for
    
    return answer;
}

function solution(friends, gifts) {
    let friend = new Map();
    let gift_and_take = Array.from({length: friends.length}, () => 0);
    
    for(var i = 0; i < friends.length; i++){
        friend.set(friends[i], i);
        gift_and_take[i] = Array.from({length: friends.length}, () => 0);
    }
        
    for(var gift_log of gifts){
        var give_and_take_name = gift_log.split(" ");
        gift_and_take[friend.get(give_and_take_name[0])][friend.get(give_and_take_name[1])]++;
    }
    
    let answer = Array.from({length: friends.length}, ()=> 0);
    let gift_index = Array.from({length: friends.length}, ()=>0);
    
    for(var i = 0; i < friends.length; i++){
        let give_gifts = 0;
        gift_and_take[i].forEach((num) => {
            give_gifts += num;
        });
                
        let take_gifts = 0;
        gift_and_take.forEach((row) => {
            take_gifts += row[i];
        });
        
        gift_index[i] = give_gifts - take_gifts;
    }
    
    for(var i = 0; i < friends.length; i++){
        for(var j = 0; j < friends.length; j++){
            if(i === j){
               continue; 
            }else if(gift_and_take[i][j] !== gift_and_take[j][i]){
                if(gift_and_take[i][j] > gift_and_take[j][i])
                    answer[i]++;
                else answer[j]++;
            }else if(gift_index[i] > gift_index[j]){
                answer[i]++;
            }else if(gift_index[i] < gift_index[j]){
                answer[j]++;
            }
        }
    }

    return Math.max(...answer) / 2;
}

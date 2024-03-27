function solution(players, callings) {
    let answer = players;
    let players_name = new Map();
    let calling_player_num = 0;
    
    for(let player of players)
        players_name.set(player, players.indexOf(player));
    
    for(let calling of callings){
        calling_player_num = players_name.get(calling);
        answer[calling_player_num] = answer[calling_player_num - 1];
        answer[calling_player_num - 1] =  calling;
        
        players_name.set(answer[calling_player_num - 1], calling_player_num - 1);
        players_name.set(answer[calling_player_num], calling_player_num);
    }
    
    return answer;
}

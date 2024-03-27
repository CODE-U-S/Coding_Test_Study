class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        answer = players;
        for(int i = 0; i < callings.length; i++){
            for(int j = 0; j < players.length; j++){
                if(players[j].equals(callings[i])){
                    String temp = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}

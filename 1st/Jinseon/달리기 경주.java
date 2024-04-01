class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        for(int i =0 ; i < players.length; i++){
            answer[i] = players[i];
        }
        for(int i =0 ; i < callings.length; i++){
            for(int j =0; j < players.length; j++){
                if(callings[i].equals(answer[j])){
                    String temp = answer[j];
                    answer[j] = answer[j-1];
                    answer[j-1] = temp;
                    break;
                }
                
            }
        }
        return answer;
    }
}
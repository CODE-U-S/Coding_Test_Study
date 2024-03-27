class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int card1_use=0, card2_use=0;
        for(int i = 0; i < goal.length; i++){
            if(goal[i].equals(cards1[card1_use])){
                card1_use = (card1_use + 1)%cards1.length;
            }
            else if(goal[i].equals(cards2[card2_use])){
                card2_use = (card2_use + 1)%cards2.length;
            } 
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}

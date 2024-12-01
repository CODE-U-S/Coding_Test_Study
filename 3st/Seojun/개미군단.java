class Solution {
    public int solution(int hp) {
   
        int generalAnts = hp / 5;
        hp %= 5;

        int soldierAnts = hp / 3;
         hp %= 3;
       
        int workerAnts = hp;

        return generalAnts + soldierAnts + workerAnts;
    }
}
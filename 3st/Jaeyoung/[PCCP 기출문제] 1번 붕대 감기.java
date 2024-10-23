import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {  
        Map<Integer, Integer> attackInfo = new HashMap<>();
        int curHealth = health;
        int successTime = 0;
             
        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
        }

        for (int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            if (attackInfo.containsKey(i)) { 
                curHealth -= attackInfo.get(i);
                successTime = 0;
            } 
            else { 
                curHealth += bandage[1];
                successTime++;
                if (successTime == bandage[0]) {
                    curHealth += bandage[2];
                    successTime = 0;
                }
                if (curHealth > health) {
                    curHealth = health;
                }
            }
            if (curHealth <= 0) { 
                return -1;
            }
        }
        return curHealth;
    }
}
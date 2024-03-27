package Sunhee.programmers;

import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
       
        HashMap<String, Integer> map = new HashMap<>();
        int[] giftcount = new int[friends.length];
        int[][] record = new int[friends.length][friends.length];
        
        for ( int i = 0; i < friends.length; i++ ) {
            map.put(friends[i], i);
        }
        
        for ( String gift : gifts ) {
            String[] giftName = gift.split(" ");
            giftcount[map.get(giftName[0])]++;
            giftcount[map.get(giftName[1])]--;
            record[map.get(giftName[0])][map.get(giftName[1])]++;    
        }
        
        for ( int i =0; i< friends.length; i++) {
            int num = 0;
            for ( int j = 0; j< friends.length; j++) {
                if ( i == j) {
                    continue;
                }    
                
                if (record[i][j] > record[j][i] ||
                     (record[i][j] == record[j][i] && giftcount[i] > giftcount[j])) {
                        num++;
                    }
            }
            
            if ( answer < num) {
                answer = num;
            }
            
        }
        
        return answer;
    }
}

import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantmap = new HashMap<>();
        for(int i=0; i<want.length; i++)
            wantmap.put(want[i], number[i]);
        
        for(int i=0; i<=discount.length-10; i++){
            HashMap<String, Integer> dismap = new HashMap<>();
            for(int j=i; j<i+10; j++)
                dismap.put(discount[j], dismap.getOrDefault(discount[j], 0)+1);
                
            if(wantmap.equals(dismap))
                answer++;
            dismap.clear();
        }
        return answer;
    }
}
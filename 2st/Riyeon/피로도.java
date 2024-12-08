import java.util.*;
class Solution {
    boolean[] check;
    int res;
    
    public void back(int p, int[][] dungeons){
        int cnt=0;
        for(int i=0; i<check.length; i++)
            if(check[i]) cnt++;
        res = Math.max(res, cnt);
        
        for(int i=0; i<check.length; i++){
            if(check[i] || p < dungeons[i][0]) continue;
            check[i] = true;
            back(p-dungeons[i][1], dungeons);
            check[i] = false;
            
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        res = Integer.MIN_VALUE;
        check = new boolean[dungeons.length];
        back(k, dungeons);
        return res;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] ar = new int[rank.length];
        for(int i=0; i<rank.length; i++)
            ar[i] = rank[i];
        Arrays.sort(ar);
        
        int answer = 0, n = 10000;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<rank.length; j++){
                if(rank[j] == ar[i] && attendance[j] == true){
                    answer += j*n;
                    n /= 100;
                }
            }
        }
        return answer;
    }
}
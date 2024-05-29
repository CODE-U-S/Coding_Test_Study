import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer=0, sum=0, i=0;
        Arrays.sort(d);
        while(i<d.length){
            answer++;
            sum += d[i++];
            if(sum > budget){
                answer--;
                break;
            }
        }
        return answer;
    }
}
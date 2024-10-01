import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int a : scoville)
            pq.add((long)a);
        
        int answer = 0;
        while(pq.peek() < K){
            if(pq.size() == 1) return -1;
            long l1 = pq.poll();
            long l2 = pq.poll();
            if(l1==0 && l2==0 && K > 0) return -1;
            
            pq.add(l1 + l2*2);
            answer++;
        }
        return answer;
    }
}
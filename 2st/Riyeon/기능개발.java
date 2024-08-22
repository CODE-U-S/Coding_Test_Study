import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<speeds.length; i++){
            double n = (100.0 - progresses[i]) / speeds[i];
            queue.add(n%1==0? (int)n : (int)n+1);
        }
        List<Integer> li = new ArrayList<>();
        while(!queue.isEmpty()){
            int fp = queue.poll();
            int cnt = 1;
            while(!queue.isEmpty() && fp >= queue.peek()){
                queue.poll();
                cnt++;
            }
            li.add(cnt);
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}
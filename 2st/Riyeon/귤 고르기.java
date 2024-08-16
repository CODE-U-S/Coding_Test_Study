import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine)
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        ArrayList<Integer> velist = new ArrayList<>(map.values());
        Collections.sort(velist, Collections.reverseOrder());
        
        int sum = 0;    // 귤의 개수
        int cnt = 0;
        for(int v : velist){
            cnt++;
            if(sum + v >= k)
                break;
            else
                sum += v;
        }
        return cnt;
    }
}
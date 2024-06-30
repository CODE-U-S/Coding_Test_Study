import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) map.put(rank[i], i);
        }
        
        List<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr);
        
        return 10000 * map.get(arr.get(0)) + 100 * map.get(arr.get(1)) + map.get(arr.get(2));
    }
}
import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : topping)
            map.put(i, map.getOrDefault(i, 0)+1);
        
        for(int i : topping){
            set.add(i);
            int n = map.get(i);
            if(n-1 == 0)
                map.remove(i);
            else
                map.put(i, n-1);
            
            if(set.size() == map.keySet().size())
                answer++;
        }
        return answer;
    }
}
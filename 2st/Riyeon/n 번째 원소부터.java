import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> li = new ArrayList<>();
        for(int i : num_list)
            li.add(i);
        li = li.subList(n-1, li.size());
        
        return li.stream().mapToInt(i->i).toArray();
    }
}
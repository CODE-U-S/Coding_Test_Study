import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> li = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%k==0)
                li.add(i);
        }
        return li.stream().mapToInt(i -> i).toArray();
    }
}
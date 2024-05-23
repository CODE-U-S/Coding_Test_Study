import java.util.*;
class Solution {
    public int[] solution(long n) {
        List<Integer> li = new ArrayList<>();
        
        while(n > 0){
            int num = (int)(n%10);
            li.add(num);
            n/=10;
        }
        
        return li.stream().mapToInt(i->i).toArray();
    }
}
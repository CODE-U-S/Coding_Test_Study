import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for(int i : arr)
            li.add(i);
        
        int n = 1;
        while(li.size() != n){
            if(li.size() > n)
                n*=2;
            else
                li.add(0);                
        }
        
        return li.stream().mapToInt(i->i).toArray();
    }
}
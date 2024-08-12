import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int ele[] = new int[elements.length*2];
        for(int i=0; i<elements.length; i++){
            ele[i] = elements[i];
            ele[i+elements.length] = elements[i];
        }
        
        Set<Integer> set = new HashSet<>();
        // 수열의 합
        for(int i=0; i<elements.length; i++){
            for(int j=0; j<elements.length; j++)
                set.add(Arrays.stream(ele, j, j+i).sum());
        }
        return set.size();
    }
}
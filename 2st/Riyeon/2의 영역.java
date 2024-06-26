import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for(int i : arr)
            li.add(i);
        if(li.indexOf(2) == -1)
            return new int[] {-1};
        else{
            li = li.subList(li.indexOf(2), li.lastIndexOf(2)+1);
            return li.stream().mapToInt(i->i).toArray();
        }
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> li = new ArrayList<>();
        for(int[] itv : intervals){
            for(int i = itv[0]; i<=itv[1]; i++)
                li.add(arr[i]);
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}
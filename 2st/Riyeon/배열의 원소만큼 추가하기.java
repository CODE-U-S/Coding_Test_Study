import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for(int ar : arr){
            for(int i=0; i<ar; i++){
                li.add(ar);
            }
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}
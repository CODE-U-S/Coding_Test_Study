import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i] == true){
                for(int j=0; j<arr[i]*2; j++)
                    li.add(arr[i]);
            }else{
                for(int j=0; j<arr[i]; j++)
                    li.remove(li.size()-1);
            }
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}
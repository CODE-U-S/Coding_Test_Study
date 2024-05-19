import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> li = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            int c = 0;
            for(int j=0; j<delete_list.length;j++)
                if(arr[i] == delete_list[j])
                    c++;
            if(c==0)
                li.add(arr[i]);
        }
            
        return li.stream().mapToInt(i->i).toArray();
    }
}
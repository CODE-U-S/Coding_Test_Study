import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i < num_list.length; i++){
            if(n!=1 && i==0)i=slicer[0];
            
            if(n!=2 && i<slicer[1]+1){
                li.add(num_list[i]);
            }else if(n==2)
                li.add(num_list[i]);
            else break;
            
            if(n==4) i+=slicer[2]-1;
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}
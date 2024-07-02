import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> li = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=0; j<li.size(); j++)
                if(arr[i] == li.get(j))
                    cnt++;
            if(cnt==0 && li.size()<k)
                li.add(arr[i]);
        }
        
        while(li.size() < k){
            li.add(-1);
        }
            
        return li.stream().mapToInt(i->i).toArray();
    }
}
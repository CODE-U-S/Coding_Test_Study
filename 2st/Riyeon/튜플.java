import java.util.*;
class Solution {
    public List<Integer> solution(String s) {
        s = s.substring(2, s.length()-2).replace("},{", "-");
        String arr[] = s.split("-");
        Arrays.sort(arr,Comparator.comparingInt(String::length));
        
        List<Integer> li = new ArrayList<>();
        for(String str :arr){
            String temp[] = str.split(",");
            for(int i=0; i<temp.length; i++){
                int n = Integer.parseInt(temp[i]);
                if(!li.contains(n))
                    li.add(n);
            }
        }
        return li;
    }
}
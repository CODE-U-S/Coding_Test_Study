import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ans = new ArrayList<>();
        for(String str : intStrs){
            int ns = Integer.parseInt(str.substring(s, s+l));
            if(ns > k)
                ans.add(ns);
        }
        
        return ans;
    }
}
import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> li = new ArrayList<>();
        for(String s : strArr){
            if(!s.contains("ad"))
                li.add(s);
        }
        return li.toArray(new String[0]);
    }
}
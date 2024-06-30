import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> li = new ArrayList<>();
        for(String s : my_string.split(" ")){
            if(!s.isEmpty())
                li.add(s);
        }
        return li.toArray(new String[0]);
    }
}
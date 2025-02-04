import java.util.*;

class Solution {
    public String[] solution(String[] names) {
       
        List<String> leaders = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            leaders.add(names[i]);
        }

        return leaders.toArray(new String[0]);
    }
}

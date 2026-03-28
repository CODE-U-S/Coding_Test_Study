import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        
        List<String> answer = new ArrayList<>();
        for (String str : temp) {
            if (!str.equals("")) {
                answer.add(str);
            }
        }
        
        Collections.sort(answer);
        
        return answer.toArray(new String[0]);
    }
}
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(String.valueOf(n));
        }
        
        Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        StringBuilder answer = new StringBuilder();
        for (String s : list) {
            answer.append(s);
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}
//level 2

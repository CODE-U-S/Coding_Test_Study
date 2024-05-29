import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> li = new ArrayList<>();
        for(String s : myString.split("x")){
            if(!s.isEmpty())
                li.add(s);
        }
        String[] answer = li.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}
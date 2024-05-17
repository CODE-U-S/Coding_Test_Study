import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> li = new ArrayList<>();
        for(String s : myString.split("x")){
            li.add(s.length());
        }
        if(myString.charAt(myString.length()-1) == 'x')
            li.add(0);
        return li.stream().mapToInt(i->i).toArray();
    }
}
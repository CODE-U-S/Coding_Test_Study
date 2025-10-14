import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {      
                list.add(ch - '0');           
            }
        }
        

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

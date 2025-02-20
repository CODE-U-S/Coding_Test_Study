import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numList = new ArrayList<>();

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                numList.add(ch - '0'); 
        }

        Collections.sort(numList);

        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }
}
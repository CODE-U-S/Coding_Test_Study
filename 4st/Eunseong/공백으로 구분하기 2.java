import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        ArrayList<String> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }
        String answer[] = new String[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
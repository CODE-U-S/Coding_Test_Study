import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(String str : strlist)
            answer.add(str.length());
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class LengthOfArrayElement {
    public static void main(String args[]) {
        String[] strlist = {"We", "are", "the", "world!"};
        Solution s = new Solution();
        int[] answer = s.solution(strlist);
        System.out.println(Arrays.toString(answer));  // [2, 3, 3, 6]
    }
}

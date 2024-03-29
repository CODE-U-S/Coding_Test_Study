import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}

public class FindingKimInSeoul {
    public static void main(String args[]) {
        String[] babbling = { "Jane", "Kim" };
        Solution s = new Solution();
        String result = s.solution(babbling);
        System.out.println(result);
    }
}

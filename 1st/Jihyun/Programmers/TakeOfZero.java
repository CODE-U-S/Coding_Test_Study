class Solution {
    public String solution(String str) {
        String answer = String.valueOf(Integer.parseInt(str));
        return answer;
    }
}

public class TakeOfZero {
    public static void main(String args[]) {
        String str = "0010";
        Solution s = new Solution();
        String answer = s.solution(str);
        System.out.println(answer);
    }
}
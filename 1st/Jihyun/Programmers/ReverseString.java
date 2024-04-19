class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer(my_string);
        return answer.reverse().toString();
    }
}

public class ReverseString {
    public static void main(String args[]) {
        String a = "Hello World";
        String answer;
        Solution s = new Solution();
        answer = s.solution(a);
        System.out.println(answer);
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        boolean a = true;
        s = s.toLowerCase();
        for(String i : s.split("")) {
            answer += a ? i.toUpperCase() : i;
            a = (i.equals(" ")) ? true : false;
        }
        return answer;
    }
}

public class CreateJadenCaseString {
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "3people unFollowed me";
        String answer = s.solution(a);
        System.out.println(answer);
    }
}
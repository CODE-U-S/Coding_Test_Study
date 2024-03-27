package Programmers;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = r; i < code.length(); i += q)
            answer += code.charAt(i);
        return answer;
    }
}

public class PrCode {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 1, "qjnwezgrpirldywt"));
    }
}
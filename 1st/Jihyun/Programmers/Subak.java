class Solution {
    public String solution(int n) {
        String answer = "";
        String subak = "수박";
        for (int i = 0; i < n; i++)
            answer += subak.charAt(i % 2);
        return answer;
    }
}

public class Subak {
    public static void main(String args[]) {
        int a = 15;
        Solution s = new Solution();
        String result = s.solution(a);
        System.out.println(result);
    }
}
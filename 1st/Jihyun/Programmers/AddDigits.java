class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] a = Integer.toString(n).split("");
        for(int i = 0; i < a.length; i++)
            answer += Integer.parseInt(a[i]);
        return answer;
    }
}

public class AddDigits {
    public static void main(String args[]) {
        int a = 123;
        Solution s = new Solution();
        int result = s.solution(a);
        System.out.println(result);
    }
}
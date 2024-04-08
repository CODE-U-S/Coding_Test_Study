class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}

public class DotProduct {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        Solution s = new Solution();
        int result = s.solution(a, b);
        System.out.println(result);
    }
}
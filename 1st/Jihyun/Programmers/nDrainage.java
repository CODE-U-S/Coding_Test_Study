class Solution {
    public int solution(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }
}

public class nDrainage {
    public static void main(String args[]) {
        int num = 98, n = 2;
        Solution s = new Solution();
        int answer = s.solution(num, n);
        System.out.println(answer);
    }
}

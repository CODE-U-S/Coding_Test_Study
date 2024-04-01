class Solution {
    public long solution(long n) {
        long sqrt_num = (long) Math.sqrt(n);

        if (Math.pow(sqrt_num, 2) == n)
            return (long) Math.pow(sqrt_num + 1, 2);

        return -1;
    }
}

public class FindTheSquareRootOfInteger {
    public static void main(String args[]) {
        long a = 121;
        Solution s = new Solution();
        long result = s.solution(a);
        System.out.println(result);
    }
}

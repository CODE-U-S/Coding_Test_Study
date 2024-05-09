class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}

class FlipNumber {
    public static void main(String args[]) {
        long a = 12345;
        Solution s = new Solution();
        int[] result = s.solution(a);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}

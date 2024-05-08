class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long temp = money;
        for (int i = 0; i < count; i++) {
            temp -= price * (i + 1);
        }
        answer = temp * -1;

        return (answer > 0) ? answer : 0;
    }
}

public class CalculateInsufficientAmount {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 20, 4));
    }
}
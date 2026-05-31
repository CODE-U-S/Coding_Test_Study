class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        // 누적합
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        
        if (money - sum < 0) {
            answer = (money - sum) * -1;
        }
        else {
            answer = 0;
        }

        return answer;
    }
}
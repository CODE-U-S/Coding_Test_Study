class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return 45 - sum;
    }
}
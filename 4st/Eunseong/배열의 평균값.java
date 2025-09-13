class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double)sum / i;
        
        return answer;
    }
}
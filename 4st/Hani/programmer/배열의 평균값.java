class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        total = answer / numbers.length;
        
        return total;
    }
}
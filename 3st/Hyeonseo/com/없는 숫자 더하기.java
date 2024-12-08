class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(numbers[i] == j) {
                    sum += j;
                }
            }
            
        }
        return 45-sum;
    }
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int first = 0;
        int second = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first) {
                second = first;
                first = numbers[i];
            }
            else if (numbers[i] > second) {
                second = numbers[i];
            }
        }
        answer = second * first;
        
        return answer;
    }
}
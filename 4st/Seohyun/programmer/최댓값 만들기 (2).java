class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int size=numbers.length;
        
        java.util.Arrays.sort(numbers);
        
        answer= numbers[size-1]*numbers[size-2] > numbers[0]*numbers[1] ? numbers[size-1]*numbers[size-2] : numbers[0]*numbers[1];
        
        return answer;
    }
}
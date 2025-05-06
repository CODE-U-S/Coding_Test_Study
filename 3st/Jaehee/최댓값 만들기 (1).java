class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int n = numbers.length;
        int answer = numbers[n - 1] * numbers[n - 2];
        
        return answer;
    }
}

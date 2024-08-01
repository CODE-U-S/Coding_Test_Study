class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        int a = numbers.length;
        for(int i=0; i<a; i++) {
            sum += numbers[i];
        }
        answer = sum/a;
        return answer;
    }
}
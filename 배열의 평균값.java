class Solution {
    public double solution(int[] numbers) {
        double as=0;
        for(int i = 0;i<numbers.length;i++){
            as +=numbers[i];
        }
        double answer = as/numbers.length;
        return answer;
    }
}
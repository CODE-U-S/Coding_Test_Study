class Solution {
    public double solution(int[] numbers) {
        double a = 0;
        
        //누적합 구하기
        for(int i=0;i <= numbers.length - 1;i++){
          a += numbers[i];
        }
        
        double answer = 0;
        answer = a/numbers.length;
        return answer;
    }
}
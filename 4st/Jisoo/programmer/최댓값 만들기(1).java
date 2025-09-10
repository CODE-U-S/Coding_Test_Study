import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]*numbers[i+1]>answer){
               answer= numbers[i]*numbers[i+1];
            }
        }
            
        return answer;
    }
}
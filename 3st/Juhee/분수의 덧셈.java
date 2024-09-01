import java.util.Arrays;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2]; 
        int num3 = num1*num2; 
        int denum3 = denum1*num2+denum2*num1; 
        int max = 1;  
        for(int i=1; i <= num3 && i<= denum3; i++){ 
            if(num3%i==0 && denum3%i==0){
                max = i;
            }
        }
        answer[0] = denum3/max; 
        answer[1] = num3/max; 
        
        return answer;
    }
}
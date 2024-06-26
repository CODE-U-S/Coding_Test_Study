import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        long number = 0;
        boolean isPrimeNumber = true;
        String prime = "";
        
        prime = Integer.toString(n, k);
        
        String[] primeNumber = prime.split("0");
        
        for(String num : primeNumber){
            try{
                number = Long.parseLong(num);
                if(number == 1) continue;
                else if(number == 2){
                    answer++;
                    continue;
                }
            }catch(NumberFormatException e){
                continue;
            }
            
            for(int i = 3; i <= Math.sqrt(number); i = i+2){
                if(number % i == 0){
                    isPrimeNumber = false;
                    break;
                }
            }//inner for
            
            if(isPrimeNumber){
                answer++;
                isPrimeNumber = true;
            }
        }
        
        return answer;
    }
}

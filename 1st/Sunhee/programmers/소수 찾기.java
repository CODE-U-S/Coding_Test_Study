package Sunhee.programmers;

class Solution {
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<n+1; i++) {
            if(this.isPrime(i)) {
                answer++;
            }
                
        }
        
        return answer;
    }
}
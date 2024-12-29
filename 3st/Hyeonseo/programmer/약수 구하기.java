class Solution {
    public int[] solution(int n) {
        // 약수 개수 저장할 변수
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        // 약수 저장할 배열
        int[] divisors = new int[count];
        
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                divisors[index++] = i;
            }
        }
        
        return divisors;
    }
}
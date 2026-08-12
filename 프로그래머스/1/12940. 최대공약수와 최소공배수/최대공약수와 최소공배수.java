class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int yak = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                yak = i; // 마지막 공약수가 최대공약수
            }
        }
        answer[0] = yak;
        
        answer[1] = n * m / yak; 
        return answer;
    }
}
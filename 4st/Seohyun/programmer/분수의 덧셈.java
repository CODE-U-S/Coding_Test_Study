class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1);  //분자
        int denom = denom1 * denom2;  //분모
        
        int a = numer;
        int b = denom;

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int gcd = a;

        answer[0] = numer / gcd;
        answer[1] = denom / gcd;
        
        return answer;
    }
}
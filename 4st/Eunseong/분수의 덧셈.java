class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자 계산
        int Bunza = numer1 * denom2 + numer2 * denom1;
        // 분모 계산
        int Bunmo = denom1 * denom2;
        
        // 최대공약수 구하기
        int gcd = getGCD(Bunza, Bunmo);
        
        // 기약분수 형태로 반환
        return new int[]{Bunza / gcd, Bunmo / gcd};
    }

    // 최대공약수(GCD) 구하는 함수 
    private int getGCD(int a, int b) {
        while (b != 0) {
            int imsi = b;
            b = a % b;
            a = imsi;
        }
        return a;
    }
}

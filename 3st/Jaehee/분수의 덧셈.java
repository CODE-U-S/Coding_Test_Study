class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = denom2 * numer1 + denom1 * numer2;
        
        int gcdValue = gcd(denom, numer);
        
        int[] result = new int[2];
        result[0] = numer / gcdValue; 
        result[1] = denom / gcdValue; 
        
        return result;
    }

    public static int gcd(int n, int m) {
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
}
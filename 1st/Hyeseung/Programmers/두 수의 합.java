import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger i1 = new BigInteger(a);
        BigInteger i2 = new BigInteger(b);
        
        return i1.add(i2) + "";
    }
}
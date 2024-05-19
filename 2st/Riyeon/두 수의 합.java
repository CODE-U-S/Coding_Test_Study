import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger s = aa.add(bb);
        return s.toString();
    }
}
import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        BigInteger answer = num1.add(num2);
        
        return answer.toString();
    }
}
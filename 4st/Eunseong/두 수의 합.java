import java.math.BigDecimal;
class Solution {
    public String solution(String a, String b) {
        BigDecimal b1 = new BigDecimal(a);
        BigDecimal b2 = new BigDecimal(b);
        return b1.add(b2).toString();
    }
}
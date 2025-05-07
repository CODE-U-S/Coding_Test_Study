class Solution {
    public String solution(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        
        a = LPAD(a, maxLen);n
        b = LPAD(b, maxLen);
        
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        
        for (int i = a.length() - 1; i >= 0; i--) {
            int num = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
          
            if (num >= 10) {
                carry = 1;
                num %= 10;
            } else {
                carry = 0;
            }
            
            sb.append(num);
        }
        
        if (carry == 1) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
    
    static String LPAD(String s, int len) {
        if (s.length() >= len) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len - s.length(); i++) {
            sb.append("0");
        }
        sb.append(s);
        
        return sb.toString();
    }
}
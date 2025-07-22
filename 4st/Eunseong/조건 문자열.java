class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean b = false;
        switch (ineq) {
            case "<" : 
                if (eq.equals("=")) {
                    b = n <= m;
                } else {
                    b = n < m;
                }
                break;
            default : 
                if (eq.equals("=")) {
                    b = n >= m;
                } else {
                    b = n > m;
                }
        }
        return (b) ? 1 : 0;
    }
}
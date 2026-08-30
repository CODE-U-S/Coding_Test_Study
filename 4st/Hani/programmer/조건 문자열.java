class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        String q = ineq + eq;
        
        if (q.equals("<=")) {
            if (n <= m) answer = 1;
        }
        if (q.equals(">=")) {
            if (n >= m) answer = 1;
        }
        if (q.equals(">!")) {
            if (n > m) answer = 1;
        }
        if (q.equals("<!")) {
            if (n < m) answer = 1;
        }
        
        return answer;
    }
}
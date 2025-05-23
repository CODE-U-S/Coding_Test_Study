class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if (a == b && b == c && c == d) answer = 1111 * a;
        
        else if (a == b && b == c) answer = (int)Math.pow((10 * a + d), 2);
        else if (a == b && b == d) answer = (int)Math.pow((10 * a + c), 2);
        else if (a == c && c == d) answer = (int)Math.pow((10 * a + b), 2);
        else if (b == c && c == d) answer = (int)Math.pow((10 * b + a), 2);
        
        else if (a == b && c == d) answer = (a + c) * Math.abs(a - c);
        else if (a == c && b == d) answer = (a + b) * Math.abs(a - b);
        else if (b == c && a == d) answer = (b + a) * Math.abs(b - a);
        else if (a == d && b == c) answer = (a + b) * Math.abs(a - b);
        
        else if (a == b && c != d) answer = c * d;
        else if (a == c && b != d) answer = b * d;
        else if (a == d && b != c) answer = b * c;
        else if (b == c && a != d) answer = a * d;
        else if (b == d && a != c) answer = a * c;
        else if (c == d && a != b) answer = a * b;
        
        else if (a != b && b != c && c != d) answer = Math.min(b, Math.min(a, Math.min(c, d)));
        
        return answer;
    }
}
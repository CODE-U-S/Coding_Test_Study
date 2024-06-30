class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        if(Integer.parseInt(sa + sb) > 2*a*b)
            return Integer.parseInt(sa + sb);
        else
            return 2*a*b;
    }
}
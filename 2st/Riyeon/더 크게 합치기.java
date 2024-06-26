class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        if(Integer.parseInt(sa + sb) > Integer.parseInt(sb + sa))
            return Integer.parseInt(sa + sb);
        else
            return Integer.parseInt(sb + sa);
    }
}
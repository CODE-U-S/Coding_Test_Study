class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = a + Integer.toString(b);
        String sum2 = b + Integer.toString(a);
        
        if (Integer.valueOf(sum1) >= Integer.valueOf(sum2)) {
            return Integer.valueOf(sum1);
        } else {
            return Integer.valueOf(sum2);
        }
    }
}
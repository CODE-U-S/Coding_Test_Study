class Solution {
    public int solution(int a, int b) {
       
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
       
        return Math.max(ab, ba);
    }
}

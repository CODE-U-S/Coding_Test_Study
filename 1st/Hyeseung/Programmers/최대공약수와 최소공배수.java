class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m), min = Math.min(n, m);
        
        while(min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        
        int[] arr = { max, n * m / max};
        
        return arr;
    }
}
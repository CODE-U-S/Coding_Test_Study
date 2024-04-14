class Solution {
    public int solution(int[][] sizes) {
        int max = 0, min = 0;

        for (int[] size: sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);

            max = Math.max(curMax, max); 
            min = Math.max(curMin, min);
        }
        
        return max * min;
    }
}
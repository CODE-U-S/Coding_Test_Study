class Solution {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }
}
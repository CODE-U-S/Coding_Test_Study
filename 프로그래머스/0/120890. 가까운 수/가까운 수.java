class Solution {
    public int solution(int[] array, int n) {
        int max = Math.abs(n - array[0]);
        int maxIdx = 0;
        for(int i = 1; i < array.length; i++) {
            if(max > Math.abs(n - array[i])) {
                maxIdx = i;
                max = Math.abs(n - array[i]);
            }
            else if (max == Math.abs(n - array[i])) {
                if(array[maxIdx] > array[i]) {
                    maxIdx = i;
                }
            }
        }
        return array[maxIdx];
    }
}
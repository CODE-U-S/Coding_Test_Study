class Solution {
    public int[] solution(int n) {
        int arraySize = n % 2 == 0 ? (n / 2) : (n / 2 + 1);
        int[] array = new int[arraySize];

        int initIndex = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                array[initIndex++] = i;
            }
        }

        return array;
    }
}
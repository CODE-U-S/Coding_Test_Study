class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];

        if (k % 2 == 1) { 
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] * k;
            }
        } else { 
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] + k;
            }
        }

        return result;
    }
}

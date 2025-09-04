class Solution {
    public int[] solution(int[] arr) {
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
            if (i == arr.length - 1) {
                int answer[] = {-1};
                return answer;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        int answer[] = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        return answer;
    }
}
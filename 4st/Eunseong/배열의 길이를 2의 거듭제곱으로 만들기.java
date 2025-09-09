class Solution {
    public int[] solution(int[] arr) {
        int i;
        for (i = 1; i < arr.length; i *= 2) {}
        int answer[] = new int[i];
        for (i = 0; i < answer.length; i++) {
            if (i >= arr.length) answer[i] = 0;
            else answer[i] = arr[i];
        }
        return answer;
    }
}
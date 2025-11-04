class Solution {
    public int[] solution(int[] arr) {
        int answer[];
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        if (arr.length - 1 == 0) {
            answer = new int[]{-1};
            return answer;
        }
        answer = new int[arr.length - 1];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[cnt++] = arr[i];
        }
        return answer;
    }
}
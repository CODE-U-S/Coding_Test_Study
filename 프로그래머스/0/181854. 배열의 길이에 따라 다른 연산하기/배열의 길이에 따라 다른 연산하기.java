class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        //짝수
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1 ) {
                    arr[i] += n;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
        }
        //홀수
        else if (arr.length % 2 == 1 ) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] += n;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
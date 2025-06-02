class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            cnt += arr[i];
        }
        answer = cnt / arr.length;
        return answer;
    }
}
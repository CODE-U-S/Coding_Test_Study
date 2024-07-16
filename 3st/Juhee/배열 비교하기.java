class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        int c = 0;
        int d = 0;
        for (int i = 0; i < a; i++) {
            c += arr1[i];
        }
        for (int i = 0; i < b; i++) {
            d += arr2[i];
        }
        if (a != b) {
            if (a > b) {
                answer = 1;
            } 
            else if (a < b) {
                answer = -1;
            } 
            else {
                answer = 0;
            }
        }
        if (a == b) {
            if (c > d) {
                answer = 1;
            } 
            else if (c < d) {
                answer = -1;
            } 
            else {
                answer = 0;
            }
        }
        return answer;
    }
}
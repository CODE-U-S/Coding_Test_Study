class Solution {
    public long solution(long n) {
        int len = 0;
        long temp = n;
        while (temp > 0) {
            temp /= 10;
            len++;
        }

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int)(n % 10);
            n /= 10;
        }

     
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        long answer = 0;
        for (int i = 0; i < len; i++) {
            answer = answer * 10 + arr[i];
        }

        return answer;
    }
}
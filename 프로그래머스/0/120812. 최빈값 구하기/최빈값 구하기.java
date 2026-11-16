class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int old = 0; // 이전 숫자의 등장 횟수
        int count = 1; // 현재 숫자의 등장 횟수

        // 배열 오름차순 정렬
        java.util.Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] == array[i - 1]) {
                count++;
            }
            else {
                count = 1;
            }

            if (count > old) {
                old = count;
                answer = array[i];
            }
            else if (count == old) {
                answer = -1;
            }
        }

        return answer;
    }
}
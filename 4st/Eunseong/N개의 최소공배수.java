class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int j = Math.max(answer, arr[i]);
            while (true) {
                if (j % answer == 0 && j % arr[i] == 0) {
                    answer = j;
                    break;
                }
                j++;
            }
            System.out.println(answer);
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                return 1;
            } else if (date1[i] > date2[i]) {
                break;
            }
        }
        return 0;
    }
}
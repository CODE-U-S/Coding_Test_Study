class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
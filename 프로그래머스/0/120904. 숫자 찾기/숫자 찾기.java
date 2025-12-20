class Solution {
    public int solution(int num, int k) {
        String nums = String.valueOf(num);
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) == (char)(k + '0')) {
                return i + 1;
            }
        }
        return -1;
    }
}
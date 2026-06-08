class Solution {
    public int solution(int num) {
        long n = num;

        for (int count = 0; count <= 500; count++) {
            if (n == 1) {
                return count;
            }

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }소
        }

        return -1;
    }
}
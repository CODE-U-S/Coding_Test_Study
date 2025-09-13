class Solution {
    public int solution(int a, int b) {
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    a /= i;
                    b /= i;
                    break;
                }
            }
        }
        while (b != 1) {
            if (b % 2 == 0) b /= 2;
            else if (b % 5 == 0) b /= 5;
            else return 2;
        }
        return 1;
    }
}
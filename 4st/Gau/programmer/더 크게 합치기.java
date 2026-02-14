class Solution {
    public int solution(int a, int b) {
        int temp = b;
        int mul = 1;
        while (temp > 0) {
            mul *= 10;
            temp /= 10;
        }
        int ab = a * mul + b;
        temp = a;
        mul = 1;
        while (temp > 0) {
            mul *= 10;
            temp /= 10;
        }
        int ba = b * mul + a;
        if (ab > ba) {
            return ab;
        } else {
            return ba;
        }
    }
}
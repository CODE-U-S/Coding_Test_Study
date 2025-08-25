class Solution {
    public boolean solution(int x) {
        int s = 0;
        int y = x;
        while (y > 0) {
            s += y % 10;
            y /= 10;
        }
        return (x % s == 0) ? true : false;
    }
}
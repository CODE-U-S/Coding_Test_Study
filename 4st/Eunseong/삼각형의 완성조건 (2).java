class Solution {
    public int solution(int[] sides) {
        boolean b = (sides[0] < sides[1]);
        return (b) ? sides[0] + sides[0] - 1: sides[1] + sides[1] - 1;
    }
}
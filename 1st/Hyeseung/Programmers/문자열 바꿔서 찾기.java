class Solution {
    public int solution(String myString, String pat) {
        String replacedString = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        if (replacedString.contains(pat)) return 1;
        return 0;
    }
}
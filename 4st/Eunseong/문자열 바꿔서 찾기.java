class Solution {
    public int solution(String myString, String pat) {
        return (myString.replace("A", "2").replace("B", "1").contains(pat.replace("A", "1").replace("B", "2"))) ? 1 : 0;
    }
}
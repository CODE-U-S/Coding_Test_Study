class Solution {
    public String solution(String s) {
        int n = s.length()%2 == 0? 1: 0;
        return s.substring(s.length()/2-n, s.length()/2 + 1);
    }
}
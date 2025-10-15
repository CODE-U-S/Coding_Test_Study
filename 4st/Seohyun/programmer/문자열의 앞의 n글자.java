class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.substring(0, n);
    }
}
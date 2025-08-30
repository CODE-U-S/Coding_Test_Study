class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder s = new StringBuilder();
        for (int i = r; i < code.length(); i += q) {
            s.append(code.charAt(i));
        }
        return s.toString();
    }
}
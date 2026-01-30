class Solution {
    public String solution(String rny_string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rny_string.length(); i++) {
            char ch = rny_string.charAt(i);
            if (ch == 'm') {
                result.append("rn");
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

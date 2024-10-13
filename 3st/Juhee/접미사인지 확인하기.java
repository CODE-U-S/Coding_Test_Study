class Solution {
    public int solution(String my_string, String is_suffix) {
        int len = is_suffix.length();
        int a = my_string.length() - len;
        if (a < 0) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (my_string.charAt(a + i) != is_suffix.charAt(i)) {
                return 0;
            }
        }
        return 1;
    }
}

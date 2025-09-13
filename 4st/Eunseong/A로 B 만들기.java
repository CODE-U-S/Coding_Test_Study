class Solution {
    public int solution(String before, String after) {
        char ch1[] = new char[26];
        char ch2[] = new char[26];
        for (int i = 0; i < before.length(); i++) {
            ch1[before.charAt(i) - 'a']++;
            ch2[after.charAt(i) - 'a']++;
        }
        for (int i = 0 ; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) return 0;
        }
        return 1;
    }
}
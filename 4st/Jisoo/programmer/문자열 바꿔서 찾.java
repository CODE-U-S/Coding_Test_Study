class Solution {
    public int solution(String myString, String pat) {
        char[] s = new char[myString.length()];
        for (int i = 0; i < myString.length(); i++)
            s[i] = myString.charAt(i) == 'A' ? 'B' : 'A';

        for (int i = 0; i <= s.length - pat.length(); i++) {
            int j = 0;
            while (j < pat.length() && s[i + j] == pat.charAt(j)) j++;
            if (j == pat.length()) return 1;
        }
        return 0;
    }
}

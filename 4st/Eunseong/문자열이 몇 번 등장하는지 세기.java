class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            for (int j = 0; j < pat.length(); j++) {
                if (!(myString.charAt(j + i) == pat.charAt(j))) break;
                if (j == pat.length() - 1) cnt++;
            }
        }
        return cnt;
    }
}
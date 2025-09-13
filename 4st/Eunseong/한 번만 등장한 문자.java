class Solution {
    public String solution(String s) {
        String answer = "";
        int alp[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alp[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < alp.length; i++) {
            if (alp[i] == 1) answer += Character.toString((char)('a' + i));
        }
        return answer;
    }
}
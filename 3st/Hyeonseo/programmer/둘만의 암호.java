class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int idx;
        for(int i =0; i<skip.length();i++) {
            alphabet = alphabet.replace(Character.toString(skip.charAt(i)), "");
        }
        for(int i =0; i<s.length();i++) {
            idx=alphabet.indexOf(Character.toString(s.charAt(i)))+index;
            answer+= Character.toString(alphabet.charAt(idx%alphabet.length()));
        }

        return answer;

    }
}
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i); //조각냄.
            for (int j = 0; j < index; j++) {
                word += 1;
                if (word > 'z') {
                    word -= 26;
                }
                if (skip.contains(String.valueOf(word))) { //skip에 word문자가 있는지 찾기
                    j--;
                }
            }
            answer += word;
        }
        return answer;
    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'a') {
                answer += 'A';
            }
            else if (c > 'A' &&  c <= 'Z') {
                answer += Character.toLowerCase(c);
            }
            else {
                answer += c;
            }
        }
        return answer;
    }
}
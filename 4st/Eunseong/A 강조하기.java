class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase().replaceAll("a", "A");
        return answer;
    }
}
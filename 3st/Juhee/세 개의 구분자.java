class Solution {
    public String[] solution(String myStr) {
        String[] answer;
        String s = myStr.replaceAll("[a-c]", " ");
        if (s.trim().isEmpty()) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = s.trim().split("\\s+");
        }
        return answer;
    }
}
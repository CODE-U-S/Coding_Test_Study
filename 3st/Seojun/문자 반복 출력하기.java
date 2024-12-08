class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}

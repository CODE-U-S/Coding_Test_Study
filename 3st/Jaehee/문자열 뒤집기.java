class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        int count = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i <= e) {
                answer += my_string.charAt(e-count);
                count++;
            } else {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
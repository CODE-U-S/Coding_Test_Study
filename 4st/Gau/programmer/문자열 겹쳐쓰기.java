class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len01 = overwrite_string.length();
        int len02 = my_string.length();
        String sub01 = my_string.substring(0, s);
        String sub02 = my_string.substring((s+len01), len02);
        
        answer += sub01 + overwrite_string + sub02;
        
        return answer;
    }
}
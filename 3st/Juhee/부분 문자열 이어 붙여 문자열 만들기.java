class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int len = my_strings.length;
        
        for (int i = 0; i < len; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            for (int j = start; j <= end; j++) {
                answer += my_strings[i].charAt(j);
            }
        }
        return answer;
    }
}
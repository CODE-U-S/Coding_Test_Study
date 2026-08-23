class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i = 0; i < parts.length; i++){
            for (int j = parts[i][0]; j <= parts[i][1]; j++){
                answer += my_strings[i].charAt(j);
            }
        }
        return answer;
    }
}
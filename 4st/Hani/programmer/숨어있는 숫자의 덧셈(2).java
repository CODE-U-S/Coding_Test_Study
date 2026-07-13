class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (c >= '0' && c <= '9') {
                temp += String.valueOf(c);
            }
            else if (!(c >= '0' && c <= '9') && !(temp.isEmpty())) {
                answer += Integer.parseInt(temp);
                temp = "";
            }
           
        }
        if (!temp.isEmpty()) {
            answer += Integer.parseInt(temp);
        }
        return answer;
    }
}
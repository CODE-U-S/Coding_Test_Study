class Solution {
    public String solution(String my_string, int m, int c) {
        String result = "";  
        
        for (int i = c-1; i < my_string.length(); i += m) {
            result += my_string.charAt(i);  
        }
        
        return result;  
    }
}
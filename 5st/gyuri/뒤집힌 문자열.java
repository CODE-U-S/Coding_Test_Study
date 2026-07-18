public class Solution {
    public String solution(String my_string) {
        String answer = "";
        
         StringBuffer sb = new StringBuffer(my_string);
         String reverse = sb.reverse().toString();
        
        answer = sb.toString();
        return answer;
    }
} {
    
}

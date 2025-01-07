class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                answer.append(Character.toLowerCase(ch));
            }
            
            else if (Character.isLowerCase(ch)) {
                answer.append(Character.toUpperCase(ch));
            }
        }
        
        return answer.toString();
    }
}

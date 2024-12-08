class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                answer.append('A'); 
            } else if (c == 'A') {
                answer.append('A'); 
            } else if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c)); 
            } else {
                answer.append(c); 
            }
        }
        
        return answer.toString();
    }
}

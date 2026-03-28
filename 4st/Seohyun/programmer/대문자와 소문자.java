class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(c >= 'A' && c <= 'Z'){
                sb.append((char)(c+32));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
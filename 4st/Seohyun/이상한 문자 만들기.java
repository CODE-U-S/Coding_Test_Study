class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                idx = 0;
                sb.append(ch);
            }
            else{
                if (idx%2==1){ //홀수
                    sb.append(Character.toLowerCase(ch));
                }
                else {
                    sb.append(Character.toUpperCase(ch));
                }
                idx++;
            }
        }
        return sb.toString();
    }
}
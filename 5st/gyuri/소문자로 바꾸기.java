class Solution {
    public String solution(String myString) {
        String answer = "";
        String tmp = "";
            
        for(int i = 0; i < myString.length(); i++){
            char ch = myString.charAt(i);
            if((ch >= 65) && (ch <= 90)){
                tmp += (char)(ch + 32);
            }else{
                tmp += ch;
            }
            answer = tmp;
        }
    
        return answer;
    }
}
class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i=0; i<rny_string.length(); i++){
            char c = rny_string.charAt(i);
            if(c == 'm'){
                answer += "rn";
            }else{
                 answer += c;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].length() != 0){
                answer += str[i].substring(0, 1).toUpperCase();
                answer += str[i].substring(1).toLowerCase();
            }
            answer += " ";
        }
        if(s.charAt(s.length()-1) == ' ')
            return answer;
        return answer.substring(0, answer.length()-1);
    }
}
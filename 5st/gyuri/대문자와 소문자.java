class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char c : my_string.toCharArray()){
        if(Character.isUpperCase(c)){
            answer = answer + Character.toLowerCase(c);
        }else{
            answer = answer + Character.toUpperCase(c);
        }
        }
        return answer;
    }
}
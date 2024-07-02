class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char ch : myString.toCharArray()){
            if(ch < 'l')
                answer += 'l';
            else
                answer += ch;
        }
        return answer;
    }
}
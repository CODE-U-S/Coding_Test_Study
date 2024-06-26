class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char ch : myString.toLowerCase().toCharArray()){
            if(ch == 'a')
                ch = 'A';
            answer += ch;
        }
        return answer;
    }
}
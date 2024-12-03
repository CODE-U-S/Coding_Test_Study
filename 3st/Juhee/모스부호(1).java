class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        int ascii = 97;
        String[] splitted = letter.split(" ");
        for(String s : splitted) {
            for(int i = 0; i < morse.length; i++) {
                if(morse[i].equals(s)) {
                    answer += (char)(ascii + i);
                }
            }
        }
        return answer;
    }
}

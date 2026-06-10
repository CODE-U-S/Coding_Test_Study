class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] temp = letter.split(" ");
        
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < mos.length; j++) {
                if (temp[i].equals(mos[j])) {
                    answer += (char)(j+97);
                }
            }
            
                
            
        }
        return answer;
    }
}
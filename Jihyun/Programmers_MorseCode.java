class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letters = letter.split(" ");

        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < mos.length; j++) {
                if(letters[i].equals(mos[j])) {
                    answer += (char)(j + 97);
                }
            }
        }

        return answer;
    }
}

public class Programmers_MorseCode {
    public static void main(String args[]) {
        String letter = ".... . .-.. .-.. ---";
        Solution s = new Solution();
        String answer = s.solution(letter);
        System.out.println(answer);
    }
}
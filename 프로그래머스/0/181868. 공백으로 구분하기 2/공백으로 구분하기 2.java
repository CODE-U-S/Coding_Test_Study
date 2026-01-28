import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answerlist = new ArrayList<>();
        String word = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != ' ') {
                word += my_string.charAt(i);
            }
            else {
                if (!word.equals("")) {
                    answerlist.add(word);
                    word = "";
                }
            }
        }
        
        if (!word.equals("")) {
            answerlist.add(word);
        }
        
        String[] answer = new String[answerlist.size()];
        for (int i = 0; i < answerlist.size(); i++) {
            answer[i] = answerlist.get(i);
        }
        
        return answer;
    }
}
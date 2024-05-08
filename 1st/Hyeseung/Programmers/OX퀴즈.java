class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < answer.length; i++) {
            String s[] = quiz[i].split(" ");
            int ch1 = Integer.parseInt(s[0]);
            int ch2 = Integer.parseInt(s[2]);
            int ch3 = Integer.parseInt(s[4]);
            
            if(s[1].equals("+")) 
                if(ch1 + ch2 == ch3) answer[i] = "O";
                else answer[i] = "X";
            else 
                if(ch1 - ch2 == ch3) answer[i] = "O";
                else answer[i] = "X";
        }
        return answer;
    }
}
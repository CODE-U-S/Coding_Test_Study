class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] answer = {'R', 'C', 'J', 'A'};
        char[] temp = {'T', 'F', 'M', 'N'};
        int[][] mbti = new int[4][2];
        
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 4) {
                continue;
            }
            char c = survey[i].charAt(choices[i] / 4);
            int score = (choices[i] > 4) ? choices[i] - 4 : 4 - choices[i];;
            switch (c) {
                case 'R' : mbti[0][0] += score; break;
                case 'T' : mbti[0][1] += score; break;
                case 'C' : mbti[1][0] += score; break;
                case 'F' : mbti[1][1] += score; break;
                case 'J' : mbti[2][0] += score; break;
                case 'M' : mbti[2][1] += score; break;
                case 'A' : mbti[3][0] += score; break;
                default : mbti[3][1] += score;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (mbti[i][0] < mbti[i][1]) {
                answer[i] = temp[i];
            }
        }
        return new String(answer);
    }
}
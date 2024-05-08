class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] dob = new double[score.length];
        
        for(int i = 0; i < score.length; i++)
            dob[i] = (score[i][0] + score[i][1]) / 2.0;
        
        for(int i = 0; i < answer.length; i++) {
            int rank = 1;
            for(int j = 0; j < answer.length; j++) if(dob[i] < dob[j]) rank++;
            answer[i] = rank;
        }

        return answer;
    }
}
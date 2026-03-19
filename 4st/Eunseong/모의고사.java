import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] supo = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int score[] = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < supo.length; j++) {
                if (answers[i] == supo[j][i % supo[j].length]) {
                    score[j]++;
                }
            }
        }
        
        int max = 0;
        for (int i : score) {
            if (i > max) {
                max = i;
            }
        }
        
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= max) {
                temp.add(i + 1);
            }
        }
        
        int answer[] = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
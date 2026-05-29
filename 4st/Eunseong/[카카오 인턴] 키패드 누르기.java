import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        int[][] fingerPos = new int[][]{{1, 4}, {3, 4}};
        for (int i : numbers) {
            switch (i) {
                case 1, 4, 7 : {
                    answer.append("L");
                    fingerPos[0][0] = 1;
                    fingerPos[0][1] = (i / 3) + 1;
                    break;
                }
                case 3, 6, 9 : {
                    answer.append("R");
                    fingerPos[1][0] = 3;
                    fingerPos[1][1] = i / 3;
                    break;
                }
                case 0 : {
                    i = 11;
                }
                case 2, 5, 8: {
                    int posN = (i / 3) + 1;
                    int leftDis = Math.abs(2 - fingerPos[0][0]) + Math.abs(posN - fingerPos[0][1]);
                    int rightDis = Math.abs(2 - fingerPos[1][0]) + Math.abs(posN - fingerPos[1][1]);
                    if (leftDis < rightDis) {
                        answer.append("L");
                        fingerPos[0][0] = 2;
                        fingerPos[0][1] = posN;
                    } else if (leftDis > rightDis) {
                        answer.append("R");
                        fingerPos[1][0] = 2;
                        fingerPos[1][1] = posN;
                    } else {
                        if (hand.equals("right")) {
                            answer.append("R");
                            fingerPos[1][0] = 2;
                            fingerPos[1][1] = posN;
                        } else {
                            answer.append("L");
                            fingerPos[0][0] = 2;
                            fingerPos[0][1] = posN;
                        }
                    }
                }
            }
        }
        return answer.toString();
    }
}
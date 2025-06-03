class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left" : answer[0] -= 1; break;
                case "right" : answer[0] += 1; break;
                case "up" : answer[1] += 1; break;
                case "down" : answer[1] -= 1; break;
            }
            if (answer[0] < board[0] / -2 || answer[0] > board[0] / 2) {
                answer[0] = (answer[0] < 0) ? answer[0] + 1 : answer[0] - 1;
            } else if (answer[1] < board[1] / -2 || answer[1] > board[1] / 2) {
                answer[1] = (answer[1] < 0) ? answer[1] + 1 : answer[1] - 1;
            }
        }
        return answer;
    }
}
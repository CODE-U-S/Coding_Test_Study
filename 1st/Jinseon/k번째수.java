import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int j = 0; j < commands.length; j++) {
            int[] arrays = Arrays.copyOfRange(array, commands[j][0] - 1, commands[j][1]);
            Arrays.sort(arrays);
            
            answer[j] = arrays[commands[j][2] - 1];
        }
        
        return answer;
    }
}

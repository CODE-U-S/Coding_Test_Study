import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += (score.get(photo[i][j]) == null) ? 0 : score.get(photo[i][j]);
            }
        }
        return answer;
    }
}

public class MemoriesScore {
    public static void main(String args[]) {
        String[] name = { "may", "kein", "kain", "radi" };
        int[] yearning = { 5, 10, 1, 3 };
        String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
                { "kon", "kain", "may", "coni" } };
        Solution s = new Solution();
        int[] result = s.solution(name, yearning, photo);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
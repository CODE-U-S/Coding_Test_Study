import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] stu = new int[n];
        int answer = 0;
        
        Arrays.fill(stu, 1);
        
        for (int i : lost) {
            stu[i - 1]--;
        }
        for (int i : reserve) {
            stu[i - 1]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (stu[i] == 0) {
                if (i != 0 && stu[i - 1] == 2) {
                    stu[i - 1]--;
                    stu[i]++;
                } else if (i < n - 1 && stu[i + 1] == 2) {
                    stu[i + 1]--;
                    stu[i]--;
                }
            }
        }
        
        for (int i : stu) {
            if (i != 0) answer++;
        }
        return answer;
    }
}
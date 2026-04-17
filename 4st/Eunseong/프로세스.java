import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<int[]> processes = new LinkedList<>();
        int answer = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            processes.add(new int[]{priorities[i], i});
        }
        while (!processes.isEmpty()) {
            int[] cur = processes.poll();
            boolean b = false;
            for (int j = 0; j < processes.size(); j++) {
                if (processes.get(j)[0] > cur[0]) {
                    b = true;
                    break;
                }
            }
            if (b) {
                processes.add(cur);
                continue;
            }
            answer++;
            if (cur[1] == location) return answer;
        }
        return -1;
    }
}
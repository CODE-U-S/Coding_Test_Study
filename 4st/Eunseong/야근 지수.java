import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
//         long answer = 0;
//         long sum = 0;
        
//         for (int i : works) {
//             sum += i;
//         }
//         if (n >= sum) return 0;
        
//         for (int i = 0; i < n; i++) {
//             int maxI = 0;
//             for (int j = 0; j < works.length; j++) {
//                 if (works[maxI] < works[j]) {
//                     maxI = j;
//                 }
//             }
//             works[maxI]--;
//         }
        
//         for (int i : works) {
//             answer += i * i;
//         }
        
//         return answer;

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        
        for (int i : works) {
            que.add(i);
        }
        
        for (int i = 0; i < n; i++) {
            que.add(Math.max(que.poll() - 1, 0));
        }
        
        for (int i : que) {
            answer += i * i;
        }
        
        return answer;
    }
}
// 일단 2중포를 쓰면 무조건 시간초과
// 맵에서 그냥 키밸류 하나씩 줄이는방향으로 하는게 나을듯?

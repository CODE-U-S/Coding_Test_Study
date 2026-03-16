import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] progresses, int[] speeds) {
//         LinkedList<Integer> ans = new LinkedList<>();
//         LinkedList<Integer> st = new LinkedList<>();
//         int days = 1;
//         int index = 0;
        
//         for (int i : progresses) {
//             st.offer(i);
//         }
//         for (days = 1; !st.isEmpty(); days++) {
//             int features = 0;
//             while (!st.isEmpty() && (st.peek() + speeds[index] * days) >= 100) {
//                 st.remove();
//                 index++;
//                 features++;
//             }
//             if (features != 0) {
//                 ans.offer(features);
//             }
//         }
        
//         System.out.println(ans);
        
//         int answer[] = new int[ans.size()];
//         for (int i = 0; i < answer.length; i++) {
//             answer[i] = ans.poll();
//         }
//         return answer;
        
        
        
        //  Stack<Integer> answer = new Stack<>();
        //  for (int i = 0; i < speeds.length; i++) {
        //      progresses[i] = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        //      if (i != 0 && progresses[i - 1] >= progresses[i]) {
        //          progresses[i] = progresses[i - 1];
        //      }
        //  }
        // System.out.println(Arrays.toString(progresses));
        // int preV = progresses[0];
        // int cnt = 1;
        // for (int i = 1; i < progresses.length; i++) {
        //     preV = progresses[i - 1];
        //     if (preV != progresses[i]) {
        //         answer.push(cnt);
        //         cnt = 1;
        //     } else {
        //         cnt++;
        //     }
        // }
        // answer.push(cnt);
        // return answer;
        
        Stack<Integer> answer = new Stack<>();
         for (int i = 0; i < speeds.length; i++) {
             progresses[i] = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
             if (i != 0 && progresses[i - 1] >= progresses[i]) {
                 progresses[i] = progresses[i - 1];
             }
         }
        System.out.println(Arrays.toString(progresses));
        int cnt = 1;
        for (int i = 1; i < progresses.length; i++) {
            if (progresses[i - 1] != progresses[i]) {
                answer.push(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        answer.push(cnt);
        return answer;
    }
}
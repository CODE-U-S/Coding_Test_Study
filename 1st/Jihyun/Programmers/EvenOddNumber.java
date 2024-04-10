class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0)
                answer[0]++;
            else
                answer[1]++;
        }
        return answer;
    }
}

public class EvenOddNumber {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int[] answer;
        Solution s = new Solution();
        answer = s.solution(a);
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
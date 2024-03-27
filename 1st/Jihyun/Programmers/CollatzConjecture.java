package Programmers;

class Solution {
    public int solution(int num) {
        int answer = 0;

        while(num != 1) {
            System.out.println(num + " " + answer);
            if(answer >= 500) {
                answer = -1;
                break;
            }
            if(num % 2 == 0) {
                num /= 2;
            }
            else if(num % 2 == 1)
                num = num * 3 + 1;
            answer++;
        }

        return answer;
    }
}

public class CollatzConjecture {
    public static void main(String args[]) {
        int num = 16;
        Solution s = new Solution();
        System.out.println(s.solution(num));
    }
}
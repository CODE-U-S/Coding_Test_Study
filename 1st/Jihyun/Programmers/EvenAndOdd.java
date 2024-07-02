class Solution {
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}

class EvenAndOdd {
    public static void main(String[] args) {
        Solution s = new Solution();
        int num = 3;
        String answer = s.solution(num);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String num = a1 + b1;
        if (Integer.parseInt(num) >= 2 * a * b) {
            answer = Integer.parseInt(num);
        } else {
            answer = 2 * a * b;
        }

        return answer;
    }
}
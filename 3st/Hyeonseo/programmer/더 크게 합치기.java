class Solution {
    public int solution(int a, int b) {
        String answer = a + "" + b;
        if(Integer.parseInt(a + "" + b) < Integer.parseInt(b + "" + a)) {
            answer = b + "" + a;
        }
        return Integer.parseInt(answer);
    }
}
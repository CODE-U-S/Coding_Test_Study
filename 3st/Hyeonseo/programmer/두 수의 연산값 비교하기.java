class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        String n1 = a + "" + b;
        if(Integer.parseInt(n1) > 2 * a * b) {
            answer = Integer.parseInt(n1);
        }
        return answer;
    }
}
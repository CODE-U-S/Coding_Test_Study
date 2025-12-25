class Solution {
    public int solution(int order) {
        int answer = 0;
        String orders = String.valueOf(order);
        for (int i = 0; i < orders.length(); i++) {
            if (orders.charAt(i) == '3') {
                answer++;
            }
            else if (orders.charAt(i) == '6') {
                answer++;
            }
            else if (orders.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }
}
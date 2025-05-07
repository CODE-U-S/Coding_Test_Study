class Solution {
    public int[] solution(int money) {
        int[] answer = {(money / 5500), (money % 5500)};
        return answer;
    }
}
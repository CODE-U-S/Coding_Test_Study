class Solution {
    public int[] solution(int money) {
        int cnt=money/5500;
        int[] answer = {cnt,(money-5500*cnt)};
        return answer;
    }
}
class Solution {
    public int[] solution(int money) {
        int price = 5500;
        int maxCups = money / price;
        int remainingMoney = money % price;
        
        int[] answer = {maxCups, remainingMoney};
        return answer;
    }
}
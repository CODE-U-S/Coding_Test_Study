class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int longSide = (bill[0] > bill[1]) ? bill[0] : bill[1];
        int shortSide = (bill[0] > bill[1]) ? bill[1] : bill[0];
        int longWalletSide = (wallet[0] > wallet[1]) ? wallet[0] : wallet[1];
        int shortWalletSide = (wallet[0] > wallet[1]) ? wallet[1] : wallet[0];
        while (shortSide > shortWalletSide || longSide > longWalletSide) {
            longSide /= 2;
            if (longSide < shortSide) {
                int temp = longSide;
                longSide = shortSide;
                shortSide = temp;
            }
            answer++;
        }
        return answer;
    }
}
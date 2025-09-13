class Solution {
    public int solution(int n, int k) {
        int pricePerSkewer = 12000;
        int pricePerDrink = 2000;
        int freeDrinks = n / 10;
        int paidDrinks = Math.max(0, k - freeDrinks);
        int total = (n * pricePerSkewer) + (paidDrinks * pricePerDrink);
        return total;
    }
}
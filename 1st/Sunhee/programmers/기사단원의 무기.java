package Sunhee.programmers;

class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorsCount = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorsCount[j]++;
            }
        }
        
        int iron = 0;
        for (int i = 1; i <= number; i++) {
            if (divisorsCount[i] > limit) {
                iron += power;
            } else {
                iron += divisorsCount[i];
            }
        }
        
        return iron;
    }
}

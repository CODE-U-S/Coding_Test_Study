package Hyeseung.Programmers;

class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a % 2 == 0 && a >= 50)
                arr[count] = a / 2;
            else if (a % 2 != 0 && a < 50)
                arr[count] = a * 2;
            count++;
        }
        return arr;
    }
}
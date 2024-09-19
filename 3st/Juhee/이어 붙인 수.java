class Solution {
    public int solution(int[] num_list) {
        int num1 = 1, num2 = 1;
        int a = 0, b = 0;
        
        for (int i = num_list.length - 1; i >= 0; i--) {
            if (num_list[i] % 2 == 0) {
                a += num1 * num_list[i];
                num1 *= 10;
            } else {
                b += num2 * num_list[i];
                num2 *= 10;
            }
        }
        return a + b;
    }
}

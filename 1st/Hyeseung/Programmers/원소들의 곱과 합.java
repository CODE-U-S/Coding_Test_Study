class Solution {
    public int solution(int[] num_list) {
        int sum = 0, multiply = 1;
        for (int num : num_list) {
            sum += num;
            multiply *= num;
        }

        return sum * sum > multiply ? 1 : 0;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        for (int i : num_list) {
            sum += (int)(Math.log(i) / Math.log(2));
        }
        return sum;
    }
}
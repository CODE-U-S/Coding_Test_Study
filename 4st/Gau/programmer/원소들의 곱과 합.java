class Solution {
    public int solution(int[] num_list) {
        int sum = 0; 
        int mul = 1; 
        for (int n : num_list) {
            sum += n;
            mul *= n;
        }
        return mul < (sum * sum) ? 1 : 0;
    }
}
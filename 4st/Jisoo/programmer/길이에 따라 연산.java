class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            int sum = 0;
            for (int n : num_list) {
                sum += n;
            }
            return sum;
        } else {
            int product = 1;
            for (int n : num_list) {
                product *= n;
            }
            return product;
        }
    }
}

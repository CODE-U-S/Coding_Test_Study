class Solution {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) odd += num_list[i];
            else even += num_list[i];          
        }

        return odd >= even ? odd : even;
    }
}

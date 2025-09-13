class Solution {
    public int solution(int[] num_list) {
        String oddstr = "";
        String evenstr = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                oddstr += Integer.toString(num_list[i]);
            } else {
                evenstr += Integer.toString(num_list[i]);
            }   
        }
        return Integer.parseInt(oddstr) + Integer.parseInt(evenstr);
    }
}
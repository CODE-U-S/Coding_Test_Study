class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp = 0;
        int count = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            temp = num_list[i];
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                }
                else if (temp % 2 == 1) {
                    temp = (temp - 1) / 2;
                }
                answer++;
    
            }
        }
        return answer;
    }
}
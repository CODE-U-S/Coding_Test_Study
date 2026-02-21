class Solution {
    public int[] solution(int n, int k) {
        
        int count = n / k;        
        int[] answer = new int[count];
        
        int index = 0;
        for (int i = k; i <= n; i += k) {
            answer[index++] = i;
        }
        
        return answer;
    }
}

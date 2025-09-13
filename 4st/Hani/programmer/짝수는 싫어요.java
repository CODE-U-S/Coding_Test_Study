class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                count++;
        }
        
        int[] result = new int[count];
        int num = 0;
        
        for (int i = 0; i < n; i++) {
            answer[i] = i + 1;
            
            if (answer[i] % 2 == 1)
                result[num++] = answer[i];
        }
        
        
        return result;
    }
}
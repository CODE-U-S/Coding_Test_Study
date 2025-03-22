class Solution {
    public int solution(int[] array) {
        int result = 0;
        
        for (int n : array) { 
            while (n > 0) { 
                if (n % 10 == 7) { 
                    result++; 
                }
                n /= 10; 
            }
        }
        return result; 
    }
}

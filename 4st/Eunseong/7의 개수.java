class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            do {
                answer = (array[i] % 10 == 7) ? answer + 1 : answer;
                array[i] /= 10;
            } while (array[i] > 0);
        }
        
        return answer;
    }
}
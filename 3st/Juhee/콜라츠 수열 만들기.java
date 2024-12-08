class Solution {
    public int[] solution(int n) {
        int[] temp = new int[1000];
        int index = 0;
        
        temp[index++] = n;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } 
            else {
                n = 3 * n + 1;
            }
            temp[index++] = n;
        }
        int[] answer = new int[index];
        for (int i = 0; i < index; i++) {
            answer[i] = temp[i];
        }
        return answer;
    }
}


class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int top = 0;
        
        for (int i = 0; i < ingredient.length; i++) {
            stack[top] = ingredient[i];
            top++;
            
            if (top >= 4) {
                if (stack[top-4] == 1 && stack[top-3] == 2 && stack[top-2] == 3 && stack[top-1] == 1) {
                    answer++;
                    top = top - 4;
                }
            }
        }
        return answer;
    }
}
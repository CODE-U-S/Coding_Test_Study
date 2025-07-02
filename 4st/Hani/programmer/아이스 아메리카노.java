class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;
        int num1 = 0;
        int num2 = 0;
        
        num1 = money / coffee;
        num2 = money % coffee;
        
        answer[0] = num1;
        answer[1] = num2;
        
        return answer;
    }
}
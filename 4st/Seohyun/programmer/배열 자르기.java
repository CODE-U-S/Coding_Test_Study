class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer=new int [num2];
        for(int i=num1; i<=num2; i++) {
            answer[i-num1]=numbers[i];
        }
        return answer;
//         1(num1), 2, 3(num2) (i)
//         0 1 2
            
//         2 3
//         0 1
    }
}

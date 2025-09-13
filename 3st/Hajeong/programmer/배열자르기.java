class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len = num2 - num1 + 1;
        int[] answer = new int[len];
        
        int cnt = 0;
        for( int i=0; i<numbers.length; i++ )
        {
            if( num1 <= i && i <= num2 )
            {
                answer[cnt] = numbers[i];
                cnt++;
            }    
        }
        return answer;
    }
}
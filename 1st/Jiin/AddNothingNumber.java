class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i <= 9; i++){
            answer += i;
            if(i < numbers.length)
                answer -= numbers[i];
        }
        
        return answer;
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i]<numbers[j]) {
                    temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
            answer=numbers[0]*numbers[1];
        }
        return answer;
    }
}
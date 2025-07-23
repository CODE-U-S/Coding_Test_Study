class Solution {
    public double solution(int[] numbers) {
    int sum=0;
    double cnt=0;
        
    for(int i=0; i<numbers.length; i++) {
        sum+=numbers[i];
        cnt++;
    }
    double answer =sum/cnt;
    return answer;
    }
}
      
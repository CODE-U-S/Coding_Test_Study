class Solution {
    public int solution(int[] array, int height) {
        int cnt=0;
        for(int i = 0; i<array.length;i++)
            if(array[i]>height) cnt++;
            
    
        int answer = cnt;
        return answer;
    }
}
class Solution {
    public int solution(int[] array) {
        int max = 0;
        int num = 0;
        int answer = 0;
        
        int count[] = new int[1000];
        for (int n : array){
            count[n]++;
        }
        
        for(int c : count ){
            if( c > max)
                max = c;
        }
        
        for (int i = 0; i < count.length; i++){
            if (count[i] == max){
                answer = i;
                num++;
            }
        }
        if(num > 1)
            answer = -1;
        
        return answer;
    }
}
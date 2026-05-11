import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int cnt = 1;
        
        Arrays.sort(array);
        
        if(array.length == 1) return array[0];
        
        for(int i=0; i<array.length-1; i++) {
            if(array[i]==array[i+1]) {
                cnt++;
                if(cnt>max){
                    max = cnt;
                    answer = array[i];
                }else if(cnt == max) {
                    max = 0;
                }
            }else{
                cnt = 1;
            }
        }
        
        return (max == 0)? -1 : answer;
    }
}
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int k = 0;
        for(int i=0; i<section.length; i++){
            if(section[k]+m-1 < section[i]){
                answer++;
                k = i;
            }
        }
        
        return answer;
    }
}
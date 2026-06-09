class Solution {
    public int[] solution(int n, int k) {
        
        int[] answer = new int[n/k];
        
       
        int idx = 0;
        for(int i = k; i<=n; i++){
            if(i%k==0){
            answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n) {
        
        int cnt= n%2==1? n/2+1 : n/2;
        int[] answer=new int[cnt];
        int k=1;
        
        answer[0]=1;
        for (int i=1; i<answer.length; i++) {
            k+=2;
            answer[i]=k;
        }
        
            
        return answer;
    }
}
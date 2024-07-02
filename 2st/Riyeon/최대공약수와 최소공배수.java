class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int b, s, i=1;
        if(n > m){
            b = n; s = m;
        }else{
            b = m; s = n;
        }
        
        while(answer[1]==0){
            if(n%i==0 && m%i==0 && i<=b)
                answer[0] = i;
            if(i>=s && i%n==0 && i%m==0)
                answer[1] = i;
            i++;
        }
        return answer;
    }
}
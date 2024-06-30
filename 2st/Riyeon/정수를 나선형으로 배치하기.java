class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int rs=0, re=n-1, cs=0, ce=n-1;
        while(num <= n*n){
            for(int i=cs; i<=ce; i++)
                answer[rs][i] = num++;
            rs++;
            for(int i=rs; i<=re; i++)
                answer[i][ce] = num++;
            ce--;
            for(int i=ce; i>=cs; i--)
                answer[re][i] = num++;
            re--;
            for(int i=re; i>=rs; i--)
                answer[i][cs] = num++;
            cs++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int n, int k) {
        int answer=0;
        answer=n*12000+k*2000;
        if(n>=10)
            answer=answer-(n/10)*2000;
        return answer;
    }
}
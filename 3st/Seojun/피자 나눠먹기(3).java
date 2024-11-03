class Solution {
    public int solution(int slice, int n) {
        int as=0;
        if(n%slice!=0){
            as=n/slice+1;
        }
        else if(n%slice==0){
            as=n/slice;
        }
        int answer = as;
        return answer;
    }
}
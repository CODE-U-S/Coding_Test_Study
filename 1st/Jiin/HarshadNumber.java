class Solution {
    public boolean solution(int x) {
        int digit = 0;
        
        //자릿수의 합 계산
        for(int i = x; i!=0; i /= 10)
            digit = digit + (i % 10);
        
        //하샤드 수 판단
        if(x%digit == 0) return true;
        else return false;
    }
}

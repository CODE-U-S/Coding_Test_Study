public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n>0){
            if((double)(n/2) != (double)n/2){
                n--;
                ans++;
            }else n/=2;
        }
        return ans;
    }
}
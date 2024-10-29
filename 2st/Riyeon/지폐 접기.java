import java.lang.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int mx = Math.max(wallet[0], wallet[1]);
        int mn = wallet[0] + wallet[1] - mx;
        while(mx < Math.max(bill[0], bill[1]) || mn < Math.min(bill[0], bill[1])){
            if(bill[0] > bill[1]){
                bill[0] /= 2;
            }else{
                bill[1] /= 2;
            }
            answer++;
        }
        return answer;
    }
}
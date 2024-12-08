class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int high_wallet, low_wallet, high_bill, low_bill = 0;
        if(wallet[0] >= wallet[1]){
            high_wallet = wallet[0];
            low_wallet = wallet[1];
        }else{
            high_wallet = wallet[1];
            low_wallet = wallet[0];
        }
        
        if(bill[0] >= bill[1]){
            high_bill = bill[0];
            low_bill = bill[1];
        }else{
            high_bill = bill[1];
            low_bill = bill[0];
        }
        
        while(high_bill > high_wallet || low_bill > low_wallet){
            if(bill[0] >= bill[1]){
                bill[0] = bill[0]/2;
            }
            else{
                bill[1] = bill[1]/2;
            }
            
            if(bill[0] >= bill[1]){
                high_bill = bill[0];
                low_bill = bill[1];
            }else{
                high_bill = bill[1];
                low_bill = bill[0];
            }
            answer++;
        }
        
        return answer;
    }
}
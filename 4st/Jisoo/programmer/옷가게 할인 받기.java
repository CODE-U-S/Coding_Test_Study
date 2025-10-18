class Solution {
    public int solution(int price) {
        // int answer = 0;
        if(price>=500000){
            return(int)(price*0.8);
        }
        else if(price>=300000){
            return(int)(price*0.9);
        }
        else if (price>=100000){
            return(int)(price*0.95);
        }
        else{
             return price;
        }
    }
}
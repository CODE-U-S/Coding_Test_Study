class Solution {
    public int solution(int price) {
        int n=0;
        if(price<100000){
            n = price;
        }
        else if(price>=100000&&price<300000){
           n= (int)(price-(price*0.05));
        }
        else if(price>=300000&&price<500000){
            n= (int)(price-(price*0.1));
        }
        else if(price>=500000){
            n= (int)(price-(price*0.2));
        }
        int answer = n;
        return answer;
    }
}
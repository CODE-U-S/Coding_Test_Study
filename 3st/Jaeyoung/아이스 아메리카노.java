class Solution {
    public int[] solution(int money) {
        int number=0;
        int balance=0;
        do{
            number=money/5500;
        }while(money==0);
        balance=money-number*5500;
        int[] answer = {number,balance};
        return answer;
    }
}
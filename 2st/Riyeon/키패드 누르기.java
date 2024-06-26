class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lf=10, ri=12;
        for(int i : numbers){
            if(i==1 || i==4 || i==7){
                lf = i;
                answer += "L";
            }else if(i==3 || i==6 || i==9){
                ri = i;
                answer += "R";
            }else{
                if(i==0) i = 11;
                int l = Math.abs(lf-i)/3 + Math.abs(lf-i)%3;
                int r = Math.abs(ri-i)/3 + Math.abs(ri-i)%3;
                
                if(l > r){
                    answer +="R";
                    ri = i;
                }else if(l < r){
                    answer += "L";
                    lf = i;
                }else{
                    if(hand.equals("right")){
                        answer += "R";
                        ri = i;
                    }else{
                        answer += "L";
                        lf = i;
                    }
                }
            }
        }
        return answer;
    }
}
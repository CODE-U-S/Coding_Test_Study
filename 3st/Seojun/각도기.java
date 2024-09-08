class Solution {
    public int solution(int angle) {
        int as = 0;
        if(angle>90&&angle<180){
            as = 3;
        }
        else if(angle<90&&angle>0){
            as = 1;
        }
        else if(angle==90){
            as =2;
        }
        else if(angle == 180){
            as = 4;
        }
        int answer = as;
        return answer;
    }
}
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle>0 && (angle/90)<1){
            angle=1;
            answer=angle;
        }
        else if (angle==90){
            angle=2;
            answer=angle;
        }
        else if (angle>90 && (angle/90)<2){
            angle=3;
            answer=angle;
        }
        else {
            angle=4;
            answer=angle;
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] sides) {
        int temp=0;
        int answer=0;
        for(int i=0; i<2; i++) {
            for(int j=i+1; j<3; j++) {
                if(sides[i]<sides[j]) {
                    temp=sides[i];
                    sides[i]=sides[j];
                    sides[j]=temp;
                }
            }
        }
        if(sides[0]>(sides[1] + sides[2]) || sides[0]==(sides[1] + sides[2]))
            answer=2;
        else
            answer=1;
        
        return answer;
    }
}
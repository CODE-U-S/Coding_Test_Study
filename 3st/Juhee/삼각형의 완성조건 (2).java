class Solution {
    public int solution(int[] sides) {
        int a =0;
        int b =0;
        int c =0;
        if(sides[0]>=sides[1]){
            b = sides[0];
            c = sides[1];
        } 
        else{
            b = sides[1];
            c = sides[0];
        }
        int answer=0;
        a = b;
        while(a<b+c){
            answer++;
            a++;
        }
        a = b-1;
        while(b<c+a){
            answer++;
            a--;
        }
        return answer;
    }
}
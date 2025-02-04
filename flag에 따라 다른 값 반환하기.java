class Solution {
    public int solution(int a, int b, boolean flag) {
        int as =0;
        if(flag==true){
            as =  a+b;
        }
        else if(flag==false){
            as = (b-a)*-1;
        }
        int answer = as;
        return answer;
    }
}
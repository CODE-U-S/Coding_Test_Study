class Solution {
    public int[] solution(int money) {
        int answer[]=new int [2];
        int ice=5500;
        int a=0;
        int b=0;
        
        a=money/ice;
        b=money%ice;
        
        answer[0]=a;
        answer[1]=b;
        return answer;
    }
}
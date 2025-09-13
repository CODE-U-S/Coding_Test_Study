class Solution {
    public int solution(int hp) {
        int ant5=hp/5;
        int ant3=(hp%5)/3;
        int ant1=(hp%5)%3;
        int answer = 0;
        answer=ant5+ant3+ant1;   
        return answer;
    }
}
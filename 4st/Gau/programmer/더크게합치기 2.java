class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int max = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if(answer > max){
            return answer;
        }else{
            return max;
        }

    }
}
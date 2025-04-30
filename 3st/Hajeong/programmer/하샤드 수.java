class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int plus = 0;
        for(int i = 1; i <=10000; i *= 10){
            plus += (x / i % 10);
        }
        if(x % plus != 0) answer = false;
        return answer;
    }
}
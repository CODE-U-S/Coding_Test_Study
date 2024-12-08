class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long large = a;
        long small =b;
        if(large < b) {
            large = b;
            small = a;
        }
        for(long i = small; i <= large; i++) {
            answer += i;
        }
        return answer;
    }
}
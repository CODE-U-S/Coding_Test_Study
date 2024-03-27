class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int first = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int second = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        if(first < second)
            answer = second;
        else
            answer = first;
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        int answer = 1, count = 1;
        char start = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if (count == 0) {
                answer++;
                start = s.charAt(i);
            }
            if (start == s.charAt(i)) count++;
            else count--;
        }
        return answer;
    }
}
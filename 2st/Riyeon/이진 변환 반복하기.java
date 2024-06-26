class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int temp;
        while(!s.equals("1")){
            answer[0]++;
            temp = s.length();
            s = s.replaceAll("0", "");
            answer[1] += temp-s.length();
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}
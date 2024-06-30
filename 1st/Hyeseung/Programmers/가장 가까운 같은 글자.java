class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++) {
            if(s.indexOf(str[i]) == i) { answer[i] = -1; continue; }
            answer[i] = s.lastIndexOf(str[i], i) - s.lastIndexOf(str[i], i - 1);
        }
        return answer;
    }
}
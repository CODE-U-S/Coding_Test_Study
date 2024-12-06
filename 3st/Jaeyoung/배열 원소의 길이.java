class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
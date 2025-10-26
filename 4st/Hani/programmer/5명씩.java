class Solution {
    public String[] solution(String[] names) {
        int a = 0;
        int idx = 0;
        for (int i = 0; i < names.length; i += 5) {
            a++;
        }
        String[] answer = new String[a];
        for (int i = 0; i < names.length; i += 5) {
                answer[idx] = names[i];
                idx++;
        }
        return answer;
    }
}
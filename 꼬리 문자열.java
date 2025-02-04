class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for (String str : str_list) {
            if (!str.contains(ex)) {
                answer += str;
            }
        }

        return answer;
    }
}

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        StringBuilder str = new StringBuilder();
        str.append(my_string.substring(s, e + 1));
        str.reverse();
        answer += str.toString();
        answer += my_string.substring(e + 1, my_string.length());
        return answer;
    }
}
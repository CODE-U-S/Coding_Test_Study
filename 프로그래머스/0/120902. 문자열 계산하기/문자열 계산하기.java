class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = Integer.parseInt(s[0]);
        
        for (int i = 1; i < s.length - 1; i += 2) {
            if (s[i].equals("+")) {
                answer += Integer.parseInt(s[i + 1]);
            }
            else {
                answer -= Integer.parseInt(s[i + 1]);
            }
        }
        return answer;
    }
}
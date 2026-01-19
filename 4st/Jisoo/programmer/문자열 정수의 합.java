class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
          for (int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }
        return answer;
    }
}
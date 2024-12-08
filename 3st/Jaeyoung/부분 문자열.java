class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        if (str2.contains(str1)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}
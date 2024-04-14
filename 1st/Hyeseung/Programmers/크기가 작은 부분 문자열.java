class Solution {
    public int solution(String t, String p) {
        int answer = 0, len = p.length();
        
        for(int i = 0 ; i <= t.length() - len; i++){
            String test = t.substring(i, i + len);
            if(Long.parseLong(test) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}
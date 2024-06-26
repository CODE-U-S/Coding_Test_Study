class Solution {
    public int solution(String s) {
        int answer=0, y=0, n=0;
        char x = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            if(x == s.charAt(i)) y++;
            else n++;
            
            if(y == n && s.length() > i+1){
                x = s.charAt(i+1);
                answer++;
                y=0; n=0;
            }
        }
        answer++;
        return answer;
    }
}
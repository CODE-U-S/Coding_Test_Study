class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()){
            if(ch == ' ') answer += " ";
            else if(ch >= 'a'){
                if(ch+n > 'z')
                    answer += (char)('a'+n-('z'-ch)-1);
                else
                    answer += (char)(n+ch);
            }else{
                if(ch+n > 'Z')
                    answer += (char)('A'+n-('Z'-ch)-1);
                else
                    answer += (char)(n+ch);
            }
        }
        return answer;
    }
}
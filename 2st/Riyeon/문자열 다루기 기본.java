class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            int cnt=0;
            for(int i=0; i<s.length(); i++){
                if(!Character.isDigit(s.charAt(i)))
                    cnt++;
            }
            if(cnt==0) answer = true;
        }
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int result=0;
        
        s=s.toUpperCase();
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='P')
                result++;
            else if(s.charAt(i)=='Y')
                result--;
        }
        if(result==0) answer=true;
        else answer=false;

        return answer;
    }
}
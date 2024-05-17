class Solution {
    public int solution(String myString, String pat) {
        String s = "";
        for(char ch : myString.toCharArray()){
            if(ch == 'A') ch = 'B';
            else ch = 'A';
            s += ch;
        }
        
        if(s.contains(pat))
            return 1;
        else
            return 0;
    }
}
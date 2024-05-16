import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            if(pat.charAt(0) == myString.charAt(i)){
                if(pat.equals(myString.substring(i, i+pat.length()))){
                    answer=1;
                    continue;
                }
            }
        }
        return answer;
    }
}

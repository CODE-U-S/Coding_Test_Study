class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if (myString.contains(pat)) {
            return 1;
        } 
        else {
            return 0;
        }
    }
}

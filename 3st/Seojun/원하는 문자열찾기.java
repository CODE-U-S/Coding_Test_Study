class Solution {
    public int solution(String myString, String pat) {
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        if (lowerMyString.contains(lowerPat)) {
            return 1; 
        } else {
            return 0; 
        }
    }
}

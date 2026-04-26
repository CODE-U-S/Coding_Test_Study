class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int count = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if (myString.contains(pat)) {
            answer = 1;
        }
    
        return answer;
    }
}
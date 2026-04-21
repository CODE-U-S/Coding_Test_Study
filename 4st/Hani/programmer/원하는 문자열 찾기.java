class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int count = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        for (int i = 0; i < myString.length() - pat.length(); i++) {
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) == pat.charAt(j)) {
                    count++;
                }
            } 
        }
        if (count == pat.length()) {
            answer = 1;
        }
    
        return answer;
    }
}
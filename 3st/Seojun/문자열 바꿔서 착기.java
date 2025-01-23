class Solution {
    public int solution(String myString, String pat) {
        StringBuilder transformed = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                transformed.append('B');
            } else if (ch == 'B') {
                transformed.append('A');
            }
        }
        
        if (transformed.toString().contains(pat)) {
            return 1; 
        } else {
            return 0; 
        }
    }
}
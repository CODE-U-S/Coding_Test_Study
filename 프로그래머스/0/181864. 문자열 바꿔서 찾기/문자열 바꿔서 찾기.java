class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String temp = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                temp += 'B';
            }
            else {
                temp += 'A';
            }
        }
        if (temp.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'p') {
                countP++;
            }
            else if (Character.toLowerCase(s.charAt(i)) == 'y') {
                countY++;
            }
        }
        
        if (countP != countY) {
            answer = false;
        }

        return answer;
    }
}
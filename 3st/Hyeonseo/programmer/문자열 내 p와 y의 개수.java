class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'p' || ch[i] == 'P') {
                p++;
            }
            else if(ch[i] == 'y' || ch[i] == 'Y') {
                y++;
            }
        }
        if(p != y) answer = false; 
        return answer;
    }
}

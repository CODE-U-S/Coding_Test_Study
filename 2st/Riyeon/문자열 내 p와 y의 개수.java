class Solution {
    boolean solution(String s) {
        int p=0, y=0;
        for(char ch : s.toLowerCase().toCharArray()){
            if(ch == 'p') p++;
            if(ch == 'y') y++;
        }
        return p==y? true : false;
    }
}
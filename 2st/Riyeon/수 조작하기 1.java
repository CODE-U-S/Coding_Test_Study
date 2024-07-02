class Solution {
    public int solution(int n, String control) {
        for(int i=0; i<control.length(); i++){
            char ch = control.charAt(i);
            switch(ch){
                case 'w' : n++; break;
                case 's' : n--; break;
                case 'd' : n+=10; break;
                case 'a' : n-=10;
            }
        }
        return n;
    }
}
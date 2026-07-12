class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        
        boolean jud1 = false;
        boolean jud2 = false;
        
        if (x1 == true || x2 == true) {
            jud1 = true;
        }
        if(x3 == true || x4 == true) {
            jud2 = true;
        }
        
        if (jud1 == true && jud2 == true) {
            answer = true;
        }
        return answer;
    }
}
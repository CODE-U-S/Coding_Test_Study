class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        String find = String.valueOf(k);
        
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == find.charAt(0)) {
                return i+1;
            }
        }
        return -1;
    }
}
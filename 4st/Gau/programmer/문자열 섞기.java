class Solution {
    public String solution(String str1, String str2) {
        String a = "";
        
        for(int i = 0; i < str1.length(); i++) {
        	a += str1.charAt(i);
        	a += str2.charAt(i);
        }
        return a;
    }
}
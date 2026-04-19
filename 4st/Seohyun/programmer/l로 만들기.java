class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) < 'l'){
                sb.setCharAt(i, 'l');
            }
        }
        
        return sb.toString();
    }
}
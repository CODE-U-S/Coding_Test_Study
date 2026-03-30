class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) >= 97 && myString.charAt(i) >= 97){
                sb.append((char)(myString.charAt(i)-32));
            }
            else{
                sb.append(myString.charAt(i));
            }
        }
        return sb.toString();
    }
}
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=myString.length(); i>=pat.length(); i--){
            if(myString.substring(i-pat.length(), i).equals(pat)){
                answer =  myString.substring(0, i);
                break;
            }
        }//for
        return answer;
    }
}
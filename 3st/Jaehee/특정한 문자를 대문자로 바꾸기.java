class Solution {
    public String solution(String my_string, String alp) {
         String upperAlp = alp.toUpperCase();
        return my_string.replace(alp, upperAlp);
    }
}
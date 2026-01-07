class Solution {
    public String solution(String phone_number) {
        char[] numberChar = phone_number.toCharArray();
        
        for(int i=0; i<phone_number.length()-4; i++) {
            numberChar[i]='*';
        }
        String answer = String.valueOf(numberChar);
        return answer;
    }
}
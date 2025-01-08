class Solution {
    public String solution(String my_string, int num1, int num2) {

        char[] charArray = my_string.toCharArray();
        
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;
        
        return new String(charArray);
    }
}

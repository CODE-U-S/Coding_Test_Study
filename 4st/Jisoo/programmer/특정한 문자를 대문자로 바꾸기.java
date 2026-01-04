class Solution {
    public String solution(String my_string, String alp) {
        String result = "";
        char target = alp.charAt(0);  

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch == target) {
                ch = (char)(ch - ('a' - 'A')); 
            }

            result += ch;
        }

        return result;
    }
}

class Solution {
    public String solution(String n_str) {
        int i = 0;
        
        while (i < n_str.length() && n_str.charAt(i) == '0') {
            i++;
        }

        if (i == n_str.length()) {
            return "0";
        }

        return n_str.substring(i);
    }
}

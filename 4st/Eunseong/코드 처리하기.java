class Solution {
    public String solution(String code) {
        StringBuilder temp = new StringBuilder();
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if (!mode) {
                if (i % 2 == 0) temp.append(Character.toString(code.charAt(i)));
            } else {
                if (i % 2 == 1) temp.append(Character.toString(code.charAt(i)));
            }
        }
        return (temp.toString().length() == 0) ? "EMPTY" : temp.toString();
    }
}
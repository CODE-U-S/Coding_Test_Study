class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();

        for (String s : str_list) {
            if (!s.contains(ex)) {
                result.append(s);
            }
        }

        return result.toString();
    }
}

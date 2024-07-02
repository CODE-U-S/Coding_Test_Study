class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}

class StringFollowedByNCharacters {
    public static void main(String args[]) {
        String my_string = "ProgrammerS123";
        Solution s = new Solution();
        System.out.println(s.solution(my_string, 11));
    }
}
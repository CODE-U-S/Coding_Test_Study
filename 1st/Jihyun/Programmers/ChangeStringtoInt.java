class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}

class ChangeStringtoInt {
    public static void main(String args[]) {
        String a = "-1234";
        Solution s = new Solution();
        int result = s.solution(a);
        System.out.println(result);
    }
}

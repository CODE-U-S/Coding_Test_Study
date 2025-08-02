class Solution {
    public int solution(String A, String B) {
        for (int i = A.length(); i >= 0; i--) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < A.length() + i; j++) {
                str.append(A.charAt(j % A.length()));
            }
            if (str.toString().equals(B)) return A.length() - i;
        }
        return -1;
    }
}
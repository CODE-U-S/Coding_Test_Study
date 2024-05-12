class Solution {
    public String solution(String s) {
        if(s.length() % 2 == 0)
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        else
            return s.substring(s.length() / 2, s.length() / 2 + 1);
    }
}

class GetMiddleLetter {
	public static void main(String[] args) {
		String a = "abcde";
		Solution s = new Solution();
		String answer = s.solution(a);
		System.out.println(answer);	 // "c"
	}
} 
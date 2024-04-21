class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch(Exception e) {
                return false;
            }
        }
        return false;
    }
}

public class StringHandlingBasics {
	public static void main(String[] args) {
		String a = "123a";
		Solution s = new Solution();
		boolean answer = s.solution(a);
		System.out.println(answer);
	}
}
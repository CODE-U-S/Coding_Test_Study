class Solution {
    boolean solution(String s) {
        int cnt_py = 0;
        
        s = s.toLowerCase();
        s = s.replaceAll("[^p, y]", "");
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p')
                cnt_py++;
            else
                cnt_py--;
        }

        return cnt_py == 0;
    }
}

class NumberOfPAndYInString {
	public static void main(String[] args) {
		String a = "pPoooyY";
		Solution s = new Solution();
		boolean answer = s.solution(a);
		System.out.println(answer);	 // true
	}
} 
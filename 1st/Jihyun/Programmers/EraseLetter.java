class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        for(int i = 0; i < indices.length; i++)
            str[indices[i]] = "";
        
        return String.join("", str);
    }
}

class EraseLetter {
	public static void main(String[] args) {
		String a = "apporoograpemmemprs";
		int[] b = {1, 16, 6, 15, 0, 10, 11, 3};
		Solution s = new Solution();
		String answer = s.solution(a, b);	// programmers
		System.out.println(answer);
	}
}
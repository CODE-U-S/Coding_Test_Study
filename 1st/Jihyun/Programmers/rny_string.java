class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}

class rny_string {
	public static void main(String[] args) {
		String a = "masterpiece";
		Solution s = new Solution();
		String answer = s.solution(a);	// rnasterpiece
		System.out.println(answer);
	}
}
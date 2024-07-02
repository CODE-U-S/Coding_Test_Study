class Solution {
    public int solution(int a, int b, boolean flag) {
        if(!flag)
            b *= -1;
        
        return a + b;
    }
}

class ReturnsDifferentValuesD​ependingOnTheFlag {
	public static void main(String[] args) {
		int a = -4;
		int b = 7;
		boolean c = true;
		Solution s = new Solution();
		int answer = s.solution(a, b, c);
		System.out.println(answer);
	}
}
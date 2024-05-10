class Solution {
    public String solution(String myString) {
        char[] str = myString.toCharArray();
        for(int i = 0; i < str.length; i++) {
            if(str[i] < 'l')
                str[i] = 'l';
        }
        return new String(str);
    }
}

class MakeWithL {
	public static void main(String[] args) {
		String a = "abcdevwxyz";
		Solution s = new Solution();
		String answer = s.solution(a);
		System.out.println(answer);  // lllllvwxyz
	}
}
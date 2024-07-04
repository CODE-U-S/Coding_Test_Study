class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}

public class RemoveSpecificCharacter {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("abcdef", "f"));  // "abcde"
	}
}

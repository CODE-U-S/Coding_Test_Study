class Solution {
    public String solution(String myString) {
        String answer = myString;
        answer = answer.toLowerCase();
        return answer.replaceAll("a", "A");
    }
}

public class EmphasizeA {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("PrOgRaMmErS"));	 // progrAmmers
	}
} 
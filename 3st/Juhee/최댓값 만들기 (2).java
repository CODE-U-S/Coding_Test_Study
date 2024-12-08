class Solution {
    public int solution(int[] numbers) {
		int answer = -100000000;
        for(int i=0; i<numbers.length; i++) {
			for(int j=numbers.length-1; j>i; j--) {
				if(answer < numbers[i] * numbers[j]) {
					answer = numbers[i] * numbers[j];
				}
			}
		}
        return answer;
    }
}

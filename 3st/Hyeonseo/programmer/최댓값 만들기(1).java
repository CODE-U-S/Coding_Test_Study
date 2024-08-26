class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;
		int max2 = 0;
		int index = 0;
		for(int i = 0; i < numbers.length; i++) {
			 max1=Math.max(max1,numbers[i]);
			 if(max1 == numbers[i]) index = i;
		}
		for(int i = 0; i < numbers.length; i++) {
			if(index != i) {
				max2 = Math.max(max2, numbers[i]);
			}
		}
        return max1 * max2;
    }
}
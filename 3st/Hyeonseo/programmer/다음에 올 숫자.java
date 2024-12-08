class Solution {
    public int solution(int[] num) {
        		int answer = 0;
		int n = 0,gap = num[1] - num[0];
		for(int i = 0; i < num.length-1;i++) {
			n=num[i+1] - num[i];
			if(gap == n) {
				answer = num[num.length-1] + n;
			}
			else if(num[1] % num[0] == 0){
				n = num[i+1] / num[i];
				answer = num[num.length-1] * n;
			}
			gap = n;
		}
        return answer;
    }
}
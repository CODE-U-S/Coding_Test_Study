class Solution {
    public int[] solution(int n) {
        int [] arry = new int[10000];
        int a =0;
        for(int i = 1; i<=n; i++) {
			if(n%i ==0) {
				arry[a]=i;
				a++;
			}
		}
		int[] answer = new int [a];
		for(int i = 0; i<a; i++) {
			if(arry[i] != 0) {
				answer[i]=arry[i];
			}
		}
        return answer;
    }
}
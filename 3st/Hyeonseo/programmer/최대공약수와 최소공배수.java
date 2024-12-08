
class Solution {
    public int[] solution(int n, int m) {
        int answer[] = new int[2];
        int b = 0;
		int lar = n;
        int j= 1;
		while (true) {
            b = n*j;
            j++;
            if (b%n==0 && b%m==0) {
                answer[1] = n;
                 break;
                 }
            }
        if(m % n ==0 || n % m ==0) {
            if(m < n) {
                lar = m;
                answer[0] = m;
            }
        }
            else {
                for(int i = 1; i < lar; i++) {
			        if(n % i == 0 && m % i == 0) {
				        answer[0] = i;
			        }
		        }
            }
		
			
		return answer;
    }
}
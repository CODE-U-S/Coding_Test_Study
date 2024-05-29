import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] a = Long.toString(n).split("");
        Arrays.sort(a);
        for(int i = a.length - 1; i >= 0; i--)
            answer += a[i];
        
        return Long.parseLong(answer);
    }
}

class PlaceIntegersInReverseOrder {
	public static void main(String[] args) {
		long a = 118372;
		Solution s = new Solution();
		long answer = s.solution(a);
		System.out.println(answer);	 // 873211
	}
} 
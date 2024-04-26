import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++)
            answer += A[i] * B[B.length - i - 1];
        
        return answer;
    }
}


public class CreateMinimum {
	public static void main(String[] args) {
		int[] a = {1, 4, 2};
		int[] b = {5, 4, 4};
		Solution s = new Solution();
		int answer = s.solution(a, b);
		System.out.println(answer);  // 29
	}
}
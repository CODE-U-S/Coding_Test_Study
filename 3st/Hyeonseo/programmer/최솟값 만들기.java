import java.util.Arrays;
import java.util.stream.IntStream;
class Solution{
    public int solution(int []A, int []B){
        Arrays.sort(A);
		Arrays.sort(B);
		int answer = 0;
		int[] c = IntStream.concat(Arrays.stream(A), Arrays.stream(B)).toArray();
		for(int i = 0; i < A.length; i++) {
			answer += c[i] * c[c.length - i - 1];
		}
        return answer;
    }
}

//level 2
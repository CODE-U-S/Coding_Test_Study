import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        int temp = -1;
        
        for(int i : arr)
            q.add(i);
        
        for(int i = 0; i < arr.length; i++) {
            if(q.peek() != temp) {
                temp = q.poll();
                q.add(temp);
            }
            else 
                q.poll();
        }
        
        return q.stream().mapToInt(i -> i).toArray();
    }
}

public class IDontLikeSameNumber {
	public static void main(String[] args) {
		int[] a = {1,1,3,3,0,1,1};
		Solution s = new Solution();
		int[] result = s.solution(a);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
}
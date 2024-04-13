import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] answer;
        
        for(int i : arr)
            if(i % divisor == 0)
                temp.add(i);
        Collections.sort(temp);
        if(temp.size() > 0) {
            answer = new int[temp.size()];
            for(int i = 0; i < temp.size(); i++){
               answer[i] = temp.get(i);
            }
        }
        else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}

public class ArrayOfNumbersDividedInto {
	public static void main(String[] args) {
		int[] a = {5, 9, 7, 10};
		int b = 5;
        Solution s = new Solution();
        int[] result = s.solution(a, b);
        for(int i = 0; i < result.length; i++)
        	System.out.print(result[i] + " ");
	}
}
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = n - 1; i < num_list.length; i++)
            answer.add(num_list[i]);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

class FromTheNthElement {
	public static void main(String[] args) {
		int[] a = {2, 1, 6};
		int b = 3;
		Solution s = new Solution();
		int[] answer = s.solution(a, b);
		System.out.println(Arrays.toString(answer));	 // [6]
	}
}
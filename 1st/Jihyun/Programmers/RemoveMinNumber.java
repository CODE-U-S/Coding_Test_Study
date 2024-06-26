import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        int min = arr[0];
        if(arr.length > 1) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < min)
                    min = arr[i];
            }
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == min)
                    continue;
                num.add(arr[i]);
            }
                
        }
        else 
            num.add(-1);
        return num.stream().mapToInt(i -> i).toArray();
    }
}

class RemoveMinNumber {
	public static void main(String[] args) {
		int[] a = {4, 3, 2, 1};
		Solution s = new Solution();
		int[] answer = s.solution(a);
		System.out.println(Arrays.toString(answer));  // [4, 3, 2]
	}
}
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>(); 
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];

        int count = 0;
      for(int x : set) {
          arr.add(x);
      }
        Collections.sort(arr);
      for(int x : arr) {
          answer[count] = x;
          count++;
      }


        return answer;
    }
}

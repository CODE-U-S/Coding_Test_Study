import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = l; i <= r; i++) {
            String num =  String.valueOf(i);
            String[] nums = num.split("");
            int numLength =  nums.length;
            int count = 0;
                for (int j = 0; j < numLength; j++) {
                    if (nums[j].equals("0") || nums[j].equals("5")) {
                        count++;
                    }
                }
                if(count == numLength) {
                    list.add(i);
                }
            }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0) {
           answer = new int[] {-1};
            return answer;
        }
        return answer;
    }
}
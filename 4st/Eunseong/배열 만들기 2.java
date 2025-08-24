import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; Integer.valueOf(Integer.toBinaryString(i).replace("1", "5")) <= r; i++) {
            if (Integer.valueOf(Integer.toBinaryString(i).replace("1", "5")) >= l) {
                arr.add(Integer.valueOf(Integer.toBinaryString(i).replace("1", "5")));
            }
        }
        if (arr.size() == 0) {
            int answer[] = {-1};
            return answer;
        }
        else {
            int answer[] = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                answer[i] = arr.get(i);
            }
            return answer;
        }
    }
}
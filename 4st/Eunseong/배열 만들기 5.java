import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (String i : intStrs) {
            if (Integer.parseInt(i.substring(s, s + l)) > k) {
                arr.add(Integer.parseInt(i.substring(s, s + l)));
            }
        }
        int answer[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
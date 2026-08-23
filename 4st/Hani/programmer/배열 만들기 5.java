import java.util.*;


class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String temp = "";
        List<String> tempArr = new ArrayList<>();
        
        for (int j = 0; j < intStrs.length; j++) {
            for (int i = s; i < s + l; i++) {
                temp += intStrs[j].charAt(i);
            }
            tempArr.add(temp);
            temp = "";
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < tempArr.size(); i++) {
            if (Integer.parseInt(tempArr.get(i)) > k) {
                ans.add(Integer.parseInt(tempArr.get(i)));
            }
        }
        
        int[] answer = new int[ans.size()];
        
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        
        return answer;
    }
}
import java.util.HashMap;

class Solution {
    public int solution(String str1, String str2) {
        HashMap<String, Integer> set1 = new HashMap<>();
        HashMap<String, Integer> set2 = new HashMap<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String sub1 = str1.substring(i, i + 2).toUpperCase();
            if (Character.isLetter(sub1.charAt(0)) && Character.isLetter(sub1.charAt(1))) {
                set1.put(sub1, set1.getOrDefault(sub1, 0) + 1);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String sub2 = str2.substring(i, i + 2).toUpperCase();
            if (Character.isLetter(sub2.charAt(0)) && Character.isLetter(sub2.charAt(1))) {
                set2.put(sub2, set2.getOrDefault(sub2, 0) + 1);
            }
        }
        
        HashMap<String, Integer> temp = new HashMap<>();
        int hab = 0;
        int gyo = 0;
        
        for (String s : set1.keySet()) {
            temp.put(s, Math.max(temp.getOrDefault(s, 0), set1.get(s)));
        }
        for (String s : set2.keySet()) {
            temp.put(s, Math.max(temp.getOrDefault(s, 0), set2.get(s)));
        }
        for (String s : temp.keySet()) {
            hab += temp.get(s);
        }
        temp.clear();
        
        for (String s : set1.keySet()) {
            if (set2.containsKey(s)) {
                temp.put(s, Math.min(set1.get(s), set2.get(s)));
            }
        }
        for (String s : temp.keySet()) {
            gyo += temp.get(s);
        }
        
        return hab + gyo == 0 ? 65536 : (int)((double)gyo / hab * 65536);
    }
}
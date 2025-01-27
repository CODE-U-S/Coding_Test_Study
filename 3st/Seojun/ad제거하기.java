import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
    
        ArrayList<String> resultList = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                resultList.add(str);
            }
        }

        return resultList.toArray(new String[0]);
    }
}
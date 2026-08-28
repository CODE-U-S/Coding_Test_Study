import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int tempR = -1; // 배열 나눌 기준 인덱스 저장 (r)
        int tempL = -1; // 배열 나눌 기준 인덱스 저장 (r)
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                tempL = i;
                break;
            }
            else if (str_list[i].equals("r")) {
                tempR = i;
                break;
            }
            else {
                list.add(str_list[i]);
            }
        }
        
        if (tempR != -1) {
            String[] answer = Arrays.copyOfRange(str_list, tempR + 1, str_list.length);
            return answer;
        } 
        else if (tempL != -1) {
            String[] answer = list.toArray(new String[0]);
            return answer;
        }
        else {
            return new String[0];
        }
    }
}
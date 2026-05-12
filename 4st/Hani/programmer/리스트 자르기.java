import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n) {
            case 1 :
                for (int i = 0; i <= b; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2 :
                for (int i = a; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3 :
                for (int i = a; i <= b; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4 :
                for (int i = a; i <= b; i += c) {
                    list.add(num_list[i]);
                }
                break;  
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}